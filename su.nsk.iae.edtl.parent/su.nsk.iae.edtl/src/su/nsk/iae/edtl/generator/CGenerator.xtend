package su.nsk.iae.edtl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import su.nsk.iae.edtl.edtl.Model
import su.nsk.iae.edtl.edtl.Expression
import su.nsk.iae.edtl.edtl.Abbr
import su.nsk.iae.edtl.edtl.PrimaryExpression
import su.nsk.iae.edtl.edtl.XorExpression
import su.nsk.iae.edtl.edtl.AndExpression
import su.nsk.iae.edtl.edtl.UnExpression
import su.nsk.iae.edtl.edtl.Macros
import java.util.HashMap
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*

import com.opencsv.CSVWriter
import java.io.StringWriter
import su.nsk.iae.edtl.edtl.impl.ExpressionImpl
import su.nsk.iae.edtl.edtl.impl.PrimaryExpressionImpl
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import java.util.Objects
import java.util.regex.Pattern
import java.util.Map
import java.time.Duration
import java.time.temporal.TemporalUnit
import su.nsk.iae.edtl.edtl.DeclVarInput
import su.nsk.iae.edtl.edtl.VarDeclaration
import org.eclipse.emf.common.util.EList
import su.nsk.iae.edtl.edtl.DeclVarOutput
import su.nsk.iae.edtl.edtl.Requirement
import java.util.List

class CGenerator {
	def generateCCode(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context){
		val ast = resource.allContents.
					toIterable.
					filter(Model).
					get(0)
		fsa.generateFile(
                "verification.c",
                compile(ast))
	}
	
	private def compile(Model ast)'''
		«compileIncludes()»
		
		«compileVars(ast.declVarInput, ast.declVarOutput)»
		
		«compileRandBool()»
		
		«compileInitVars(ast.declVarInput, ast.declVarOutput)»
		
		«compileUpdateVars(ast.declVarInput, ast.declVarOutput)»
		
		«compileEdtlOperators()»
		
		«compileStructRequirement()»
		
		«compileCalcAttrs(ast.reqs)»
		
		«compileCheckRequirements(ast.reqs)»
		
		«compileAlgorithm()»
		
		«compileMain(ast.reqs)»
	'''
	
	private def compileIncludes() '''
	#include <stdio.h>
	#include <stdbool.h>
	#include <stdlib.h>
	#include <time.h>
	'''
	
	private def compileVars(EList<DeclVarInput> input, EList<DeclVarOutput> output){
		var List<VarDeclaration> vars = newArrayList
		
		if (input !== null) {
			for (declVarInput : input) {
				if (declVarInput.varDecls !== null) {
					for (v : declVarInput.varDecls) {
						vars.add(v.copy)
					}
				}
			}
		}
		
		if (output !== null) {
			for (declVarInput : output) {
				if (declVarInput.varDecls !== null) {
					for (v : declVarInput.varDecls) {
						vars.add(v.copy)
					}
				}
			}
		}
		
		compileVariables(vars)
	}
	
	private def compileVariables(List<VarDeclaration> vars) '''
/////////////////////////////////////////
/////////////// VARIABLES ///////////////
/////////////////////////////////////////

typedef struct vars {
	«FOR varDecl : vars»
		«varDecl.compileVariable»
	«ENDFOR»
} Vars;
	'''
	
	private def compileVariable(VarDeclaration e) '''
	bool «e.v.name»;
	bool prev_«e.v.name»;
	'''
	
	private def compileRandBool() '''
	bool rand_bool() {
	    return rand() % 2;
	}
	'''
	
	private def compileInitVars(EList<DeclVarInput> input, EList<DeclVarOutput> output) '''
	void init_vars(Vars* vars) {
	«IF input !== null»
		«FOR declVarInput : input»
			«IF declVarInput.varDecls !== null»
				«FOR v : declVarInput.varDecls»
					«"    "»vars->«v.v.name» = vars->prev_«v.v.name» = rand_bool();
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
	«ENDIF»
	«IF output !== null»
		«FOR declVarOutput : output»
			«IF declVarOutput.varDecls !== null»
				«FOR v : declVarOutput.varDecls»
					«"    "»vars->«v.v.name» = vars->prev_«v.v.name» = rand_bool();
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
	«ENDIF»
	}
	'''
	
	private def compileUpdateVars(EList<DeclVarInput> input, EList<DeclVarOutput> output) '''
	void update_vars(Vars* vars) {
	«IF input !== null»
		«FOR declVarInput : input»
			«IF declVarInput.varDecls !== null»
				«FOR v : declVarInput.varDecls»
					«"    "»vars->prev_«v.v.name» = vars->«v.v.name»;
					«"    "»vars->«v.v.name» = rand_bool();
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
	«ENDIF»
	«IF output !== null»
		«FOR declVarOutput : output»
			«IF declVarOutput.varDecls !== null»
				«FOR v : declVarOutput.varDecls»
					«"    "»vars->prev_«v.v.name» = vars->«v.v.name»;
					«"    "»vars->«v.v.name» = rand_bool();
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
	«ENDIF»
	}
	'''
	
	private def compileEdtlOperators() '''
	/////////////////////////////////////////////////////
	////////////////// EDTL OPERATORS ///////////////////
	/////////////////////////////////////////////////////
	
	bool re(bool prev_v, bool v) {
	    return prev_v && !v;
	}
	
	bool fe(bool prev_v, bool v) {
	    return !prev_v && v;
	}
	
	bool high(bool prev_v, bool v) {
	    return prev_v && v;
	}
	
	bool low(bool prev_v, bool v) {
	    return !prev_v && !v;
	}
	'''
	
	private def compileStructRequirement() '''
	////////////////////////////////////////////////////////
	///////////// REQUIREMENTS AND ATTRIBUTES //////////////
	////////////////////////////////////////////////////////
	
	typedef struct requirement {
	    bool trigger;
	    bool invariant;
	    bool final;
	    bool delay;
	    bool reaction;
	    bool release;
	} Requirement;
	'''
	
	private def compileCalcAttrs(EList<Requirement> reqs) '''
	«IF reqs !== null»
		«FOR req : reqs»
			«compileCalcAttrsFunction(req)»
		«ENDFOR»
	«ENDIF»
	'''
	
	private def compileCalcAttrsFunction(Requirement req) '''
	void calc_attrs_for_req_«req.name»(Requirement* req, Vars* vars) {
	    req->trigger = «convertTriggerToCharSequence(req.trigExpr)»
	    req->invariant = «convertInvariantToCharSequence(req.invExpr)»
	    req->final = «convertFinalToCharSequence(req.finalExpr)»
	    req->delay = «convertDelayToCharSequence(req.delayExpr)»
	    req->reaction = «convertReactionToCharSequence(req.reacExpr)»
	    req->release = «convertReleaseToCharSequence(req.relExpr)»
	}
	'''
	
	private def convertTriggerToCharSequence(Expression expr) {
		var trigger = ExprToTermConverter.convertOrDefault(expr, Attribute.TRIGGER, new BoolTerm(true))
		convertTermToCharSequence(trigger, false)
	}
	
	private def convertInvariantToCharSequence(Expression expr) {
		var invariant = ExprToTermConverter.convertOrDefault(expr, Attribute.INVARIANT, new BoolTerm(true))
		convertTermToCharSequence(invariant, false)
	}
	
	private def convertFinalToCharSequence(Expression expr) {
		var fin = ExprToTermConverter.convertOrDefault(expr, Attribute.FINAL, new BoolTerm(false))
		convertTermToCharSequence(fin, false)
	}
	
	private def convertDelayToCharSequence(Expression expr) {
		var delay = ExprToTermConverter.convertOrDefault(expr, Attribute.DELAY, new BoolTerm(false))
		convertTermToCharSequence(delay, false)
	}
	
	private def convertReactionToCharSequence(Expression expr) {
		var reaction = ExprToTermConverter.convertOrDefault(expr, Attribute.REACTION, new BoolTerm(true))
		convertTermToCharSequence(reaction, false)
	}
	
	private def convertReleaseToCharSequence(Expression expr) {
		var release = ExprToTermConverter.convertOrDefault(expr, Attribute.RELEASE, new BoolTerm(false))
		convertTermToCharSequence(release, false)
	}

	private def convertTermToCharSequence(Term term, Boolean needBreaks)'''
	«convertTermToStringWithSemicolon(term, needBreaks)»
	'''
	
	private def convertTermToStringWithSemicolon(Term term, Boolean needBreaks) {
		return convertTermToString(term, needBreaks) + ";"
	}
	
	private def String convertTermToString(Term term, Boolean needBreaks){
		if (needBreaks) {
			if (term instanceof OrTerm) {
				return "(" + convertTermToString(term.left, true) + " || " + convertTermToString(term.right, true) + ")"
			}
			if (term instanceof AndTerm) {
				return "(" + convertTermToString(term.left, true) + " && " + convertTermToString(term.right, true) + ")"
			}
		}
		if (term instanceof OrTerm) {
			return convertTermToString(term.left, true) + " || " + convertTermToString(term.right, true)
		}
		if (term instanceof AndTerm) {
			return convertTermToString(term.left, true) + " && " + convertTermToString(term.right, true)
		}
		if (term instanceof BoolTerm) {
			return String.valueOf(term.value)
		}
		if (term instanceof VarTerm) {
			return "vars->" + term.name
		}
		if (term instanceof NotTerm) {
			return "!" + convertTermToString(term.term, true)
		}
		if (term instanceof FeTerm) {
			var termTerm = term.term
			if (termTerm instanceof VarTerm) {
				return "fe(vars->prev_" + termTerm.name + ", vars->" + termTerm.name + ")"
			}
		}
		if (term instanceof ReTerm) {
			var termTerm = term.term
			if (termTerm instanceof VarTerm) {
				return "re(vars->prev_" + termTerm.name + ", vars->" + termTerm.name + ")"
			}
		}
		if (term instanceof HighTerm) {
			var termTerm = term.term
			if (termTerm instanceof VarTerm) {
				return "high(vars->prev_" + termTerm.name + ", vars->" + termTerm.name + ")"
			}
		}
		if (term instanceof LowTerm) {
			var termTerm = term.term
			if (termTerm instanceof VarTerm) {
				return "low(vars->prev_" + termTerm.name + ", vars->" + termTerm.name + ")"
			}
		}
		if (term instanceof TimeTerm) {
			return "TAU"
		}
	}
	
	private def compileCheckRequirements(EList<Requirement> reqs) '''
	//////////////////////////////////////////////////////
	///////////// REQUIREMENTS VERIFICATION //////////////
	//////////////////////////////////////////////////////
	
	bool check_requirement(void (*calc_attrs)(Requirement*, Vars*));
	
	«IF reqs !== null»
		«FOR req : reqs»
			«compileCheckRequirement(req)»
		«ENDFOR»
	«ENDIF»
	'''
	
	private def compileCheckRequirement(Requirement req) '''
	bool check_requirement_«req.name»() {
	    return check_requirement(calc_attrs_for_req_«req.name»);
	}
	'''
	
	private def compileAlgorithm()'''
	bool a(Requirement* req, Vars* vars, void (*calc_attrs)(Requirement*, Vars*));
	bool b(Requirement* req, Vars* vars, void (*calc_attrs)(Requirement*, Vars*));
	
	bool check_requirement(void (*calc_attrs)(Requirement*, Vars*)) {
	    Vars vars;
	    Requirement req;
	    init_vars(&vars);
	    while(true) {
	        calc_attrs(&req, &vars);
	        if (!req.trigger) {
	            update_vars(&vars);
	            continue;
	        }
	
	        return a(&req, &vars, calc_attrs);
	    }
	}
	
	bool a(Requirement* req, Vars* vars, void (*calc_attrs)(Requirement*, Vars*)) {
	    while (true) {
	        if (req->release) {
	            return true;
	        }
	
	        if (req->final) {
	            return b(req, vars, calc_attrs);
	        }
	
	        if (!req->invariant) {
	            printf("a(): not final and not invariant\n");
	            return false;
	        }
	
	        update_vars(vars);
	        calc_attrs(req, vars);
	    }
	}
	
	bool b(Requirement* req, Vars* vars, void (*calc_attrs)(Requirement*, Vars*)) {
	    while (true) {
	        if (req->delay) {
	            if (!req->invariant) {
	                printf("b(): delay, but not invariant\n");
	                return false;
	            }
	
	            if (!req->reaction) {
	                printf("b(): delay, but not reaction\n");
	                return false;
	            }
	
	            return true;
	        }
	
	        if (!req->invariant) {
	            printf("b(): not delay and not invariant\n");
	            return false;
	        }
	
	        if (req->reaction) {
	            return true;
	        }
	
	        update_vars(vars);
	        calc_attrs(req, vars);
	
	        if (req->release) {
	            return true;
	        }
	    }
	}
	
	void verify_requirement(char* req_name, bool (*check_req)(void)) {
	    printf("Verifying requirement \'%s\'\n", req_name);
	    bool success = check_req();
	    if (success) {
	        printf("Verification for requirement \'%s\' has succeeded", req_name);
	    } else {
	        printf("Verification for requirement \'%s\' has failed", req_name);
	    }
	
	    printf("\n\n");
	}
	'''
	
	private def compileMain(EList<Requirement> reqs) '''
	int main(int argc, char *argv[]) {
	    srand(time(NULL)); 
	    «FOR req : reqs»
	    	verify_requirement("«req.name»", check_requirement_«req.name»);
	    «ENDFOR»
	}
	'''
}
