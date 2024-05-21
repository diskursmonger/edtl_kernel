package su.nsk.iae.edtl.generator;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import su.nsk.iae.edtl.edtl.DeclVarInput;
import su.nsk.iae.edtl.edtl.DeclVarOutput;
import su.nsk.iae.edtl.edtl.Expression;
import su.nsk.iae.edtl.edtl.Model;
import su.nsk.iae.edtl.edtl.Requirement;
import su.nsk.iae.edtl.edtl.VarDeclaration;

@SuppressWarnings("all")
public class CGenerator {
  public void generateCCode(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Model ast = ((Model[])Conversions.unwrapArray((Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class)), Model.class))[0];
    fsa.generateFile(
      "verification.c", 
      this.compile(ast));
  }

  private CharSequence compile(final Model ast) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileIncludes = this.compileIncludes();
    _builder.append(_compileIncludes);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileVars = this.compileVars(ast.getDeclVarInput(), ast.getDeclVarOutput());
    _builder.append(_compileVars);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileRandBool = this.compileRandBool();
    _builder.append(_compileRandBool);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileInitVars = this.compileInitVars(ast.getDeclVarInput(), ast.getDeclVarOutput());
    _builder.append(_compileInitVars);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileUpdateVars = this.compileUpdateVars(ast.getDeclVarInput(), ast.getDeclVarOutput());
    _builder.append(_compileUpdateVars);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileEdtlOperators = this.compileEdtlOperators();
    _builder.append(_compileEdtlOperators);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileStructRequirement = this.compileStructRequirement();
    _builder.append(_compileStructRequirement);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileCalcAttrs = this.compileCalcAttrs(ast.getReqs());
    _builder.append(_compileCalcAttrs);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileCheckRequirements = this.compileCheckRequirements(ast.getReqs());
    _builder.append(_compileCheckRequirements);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileAlgorithm = this.compileAlgorithm();
    _builder.append(_compileAlgorithm);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileMain = this.compileMain(ast.getReqs());
    _builder.append(_compileMain);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  private CharSequence compileIncludes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <stdio.h>");
    _builder.newLine();
    _builder.append("#include <stdbool.h>");
    _builder.newLine();
    _builder.append("#include <stdlib.h>");
    _builder.newLine();
    _builder.append("#include <time.h>");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileVars(final EList<DeclVarInput> input, final EList<DeclVarOutput> output) {
    CharSequence _xblockexpression = null;
    {
      List<VarDeclaration> vars = CollectionLiterals.<VarDeclaration>newArrayList();
      if ((input != null)) {
        for (final DeclVarInput declVarInput : input) {
          EList<VarDeclaration> _varDecls = declVarInput.getVarDecls();
          boolean _tripleNotEquals = (_varDecls != null);
          if (_tripleNotEquals) {
            EList<VarDeclaration> _varDecls_1 = declVarInput.getVarDecls();
            for (final VarDeclaration v : _varDecls_1) {
              vars.add(EcoreUtil.<VarDeclaration>copy(v));
            }
          }
        }
      }
      if ((output != null)) {
        for (final DeclVarOutput declVarInput_1 : output) {
          EList<VarDeclaration> _varDecls_2 = declVarInput_1.getVarDecls();
          boolean _tripleNotEquals_1 = (_varDecls_2 != null);
          if (_tripleNotEquals_1) {
            EList<VarDeclaration> _varDecls_3 = declVarInput_1.getVarDecls();
            for (final VarDeclaration v_1 : _varDecls_3) {
              vars.add(EcoreUtil.<VarDeclaration>copy(v_1));
            }
          }
        }
      }
      _xblockexpression = this.compileVariables(vars);
    }
    return _xblockexpression;
  }

  private CharSequence compileVariables(final List<VarDeclaration> vars) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/////////////////////////////////////////");
    _builder.newLine();
    _builder.append("/////////////// VARIABLES ///////////////");
    _builder.newLine();
    _builder.append("/////////////////////////////////////////");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct vars {");
    _builder.newLine();
    {
      for(final VarDeclaration varDecl : vars) {
        _builder.append("\t");
        CharSequence _compileVariable = this.compileVariable(varDecl);
        _builder.append(_compileVariable, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("} Vars;");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileVariable(final VarDeclaration e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bool ");
    String _name = e.getV().getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("bool prev_");
    String _name_1 = e.getV().getName();
    _builder.append(_name_1);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  private CharSequence compileRandBool() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bool rand_bool() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return rand() % 2;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileInitVars(final EList<DeclVarInput> input, final EList<DeclVarOutput> output) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void init_vars(Vars* vars) {");
    _builder.newLine();
    {
      if ((input != null)) {
        {
          for(final DeclVarInput declVarInput : input) {
            {
              EList<VarDeclaration> _varDecls = declVarInput.getVarDecls();
              boolean _tripleNotEquals = (_varDecls != null);
              if (_tripleNotEquals) {
                {
                  EList<VarDeclaration> _varDecls_1 = declVarInput.getVarDecls();
                  for(final VarDeclaration v : _varDecls_1) {
                    _builder.append("    ");
                    _builder.append("vars->");
                    String _name = v.getV().getName();
                    _builder.append(_name);
                    _builder.append(" = vars->prev_");
                    String _name_1 = v.getV().getName();
                    _builder.append(_name_1);
                    _builder.append(" = rand_bool();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    {
      if ((output != null)) {
        {
          for(final DeclVarOutput declVarOutput : output) {
            {
              EList<VarDeclaration> _varDecls_2 = declVarOutput.getVarDecls();
              boolean _tripleNotEquals_1 = (_varDecls_2 != null);
              if (_tripleNotEquals_1) {
                {
                  EList<VarDeclaration> _varDecls_3 = declVarOutput.getVarDecls();
                  for(final VarDeclaration v_1 : _varDecls_3) {
                    _builder.append("    ");
                    _builder.append("vars->");
                    String _name_2 = v_1.getV().getName();
                    _builder.append(_name_2);
                    _builder.append(" = vars->prev_");
                    String _name_3 = v_1.getV().getName();
                    _builder.append(_name_3);
                    _builder.append(" = rand_bool();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileUpdateVars(final EList<DeclVarInput> input, final EList<DeclVarOutput> output) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void update_vars(Vars* vars) {");
    _builder.newLine();
    {
      if ((input != null)) {
        {
          for(final DeclVarInput declVarInput : input) {
            {
              EList<VarDeclaration> _varDecls = declVarInput.getVarDecls();
              boolean _tripleNotEquals = (_varDecls != null);
              if (_tripleNotEquals) {
                {
                  EList<VarDeclaration> _varDecls_1 = declVarInput.getVarDecls();
                  for(final VarDeclaration v : _varDecls_1) {
                    _builder.append("    ");
                    _builder.append("vars->prev_");
                    String _name = v.getV().getName();
                    _builder.append(_name);
                    _builder.append(" = vars->");
                    String _name_1 = v.getV().getName();
                    _builder.append(_name_1);
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("    ");
                    _builder.append("vars->");
                    String _name_2 = v.getV().getName();
                    _builder.append(_name_2);
                    _builder.append(" = rand_bool();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    {
      if ((output != null)) {
        {
          for(final DeclVarOutput declVarOutput : output) {
            {
              EList<VarDeclaration> _varDecls_2 = declVarOutput.getVarDecls();
              boolean _tripleNotEquals_1 = (_varDecls_2 != null);
              if (_tripleNotEquals_1) {
                {
                  EList<VarDeclaration> _varDecls_3 = declVarOutput.getVarDecls();
                  for(final VarDeclaration v_1 : _varDecls_3) {
                    _builder.append("    ");
                    _builder.append("vars->prev_");
                    String _name_3 = v_1.getV().getName();
                    _builder.append(_name_3);
                    _builder.append(" = vars->");
                    String _name_4 = v_1.getV().getName();
                    _builder.append(_name_4);
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("    ");
                    _builder.append("vars->");
                    String _name_5 = v_1.getV().getName();
                    _builder.append(_name_5);
                    _builder.append(" = rand_bool();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileEdtlOperators() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("////////////////// EDTL OPERATORS ///////////////////");
    _builder.newLine();
    _builder.append("/////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool re(bool prev_v, bool v) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return prev_v && !v;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool fe(bool prev_v, bool v) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return !prev_v && v;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool high(bool prev_v, bool v) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return prev_v && v;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool low(bool prev_v, bool v) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return !prev_v && !v;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileStructRequirement() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("///////////// REQUIREMENTS AND ATTRIBUTES //////////////");
    _builder.newLine();
    _builder.append("////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct requirement {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("bool trigger;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("bool invariant;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("bool final;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("bool delay;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("bool reaction;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("bool release;");
    _builder.newLine();
    _builder.append("} Requirement;");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileCalcAttrs(final EList<Requirement> reqs) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((reqs != null)) {
        {
          for(final Requirement req : reqs) {
            CharSequence _compileCalcAttrsFunction = this.compileCalcAttrsFunction(req);
            _builder.append(_compileCalcAttrsFunction);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  private CharSequence compileCalcAttrsFunction(final Requirement req) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void calc_attrs_for_req_");
    String _name = req.getName();
    _builder.append(_name);
    _builder.append("(Requirement* req, Vars* vars) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("req->trigger = ");
    CharSequence _convertTriggerToCharSequence = this.convertTriggerToCharSequence(req.getTrigExpr());
    _builder.append(_convertTriggerToCharSequence, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("req->invariant = ");
    CharSequence _convertInvariantToCharSequence = this.convertInvariantToCharSequence(req.getInvExpr());
    _builder.append(_convertInvariantToCharSequence, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("req->final = ");
    CharSequence _convertFinalToCharSequence = this.convertFinalToCharSequence(req.getFinalExpr());
    _builder.append(_convertFinalToCharSequence, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("req->delay = ");
    CharSequence _convertDelayToCharSequence = this.convertDelayToCharSequence(req.getDelayExpr());
    _builder.append(_convertDelayToCharSequence, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("req->reaction = ");
    CharSequence _convertReactionToCharSequence = this.convertReactionToCharSequence(req.getReacExpr());
    _builder.append(_convertReactionToCharSequence, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("req->release = ");
    CharSequence _convertReleaseToCharSequence = this.convertReleaseToCharSequence(req.getRelExpr());
    _builder.append(_convertReleaseToCharSequence, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  private CharSequence convertTriggerToCharSequence(final Expression expr) {
    CharSequence _xblockexpression = null;
    {
      BoolTerm _boolTerm = new BoolTerm(true);
      Term trigger = ExprToTermConverter.convertOrDefault(expr, Attribute.TRIGGER, _boolTerm);
      _xblockexpression = this.convertTermToCharSequence(trigger, Boolean.valueOf(false));
    }
    return _xblockexpression;
  }

  private CharSequence convertInvariantToCharSequence(final Expression expr) {
    CharSequence _xblockexpression = null;
    {
      BoolTerm _boolTerm = new BoolTerm(true);
      Term invariant = ExprToTermConverter.convertOrDefault(expr, Attribute.INVARIANT, _boolTerm);
      _xblockexpression = this.convertTermToCharSequence(invariant, Boolean.valueOf(false));
    }
    return _xblockexpression;
  }

  private CharSequence convertFinalToCharSequence(final Expression expr) {
    CharSequence _xblockexpression = null;
    {
      BoolTerm _boolTerm = new BoolTerm(false);
      Term fin = ExprToTermConverter.convertOrDefault(expr, Attribute.FINAL, _boolTerm);
      _xblockexpression = this.convertTermToCharSequence(fin, Boolean.valueOf(false));
    }
    return _xblockexpression;
  }

  private CharSequence convertDelayToCharSequence(final Expression expr) {
    CharSequence _xblockexpression = null;
    {
      BoolTerm _boolTerm = new BoolTerm(false);
      Term delay = ExprToTermConverter.convertOrDefault(expr, Attribute.DELAY, _boolTerm);
      _xblockexpression = this.convertTermToCharSequence(delay, Boolean.valueOf(false));
    }
    return _xblockexpression;
  }

  private CharSequence convertReactionToCharSequence(final Expression expr) {
    CharSequence _xblockexpression = null;
    {
      BoolTerm _boolTerm = new BoolTerm(true);
      Term reaction = ExprToTermConverter.convertOrDefault(expr, Attribute.REACTION, _boolTerm);
      _xblockexpression = this.convertTermToCharSequence(reaction, Boolean.valueOf(false));
    }
    return _xblockexpression;
  }

  private CharSequence convertReleaseToCharSequence(final Expression expr) {
    CharSequence _xblockexpression = null;
    {
      BoolTerm _boolTerm = new BoolTerm(false);
      Term release = ExprToTermConverter.convertOrDefault(expr, Attribute.RELEASE, _boolTerm);
      _xblockexpression = this.convertTermToCharSequence(release, Boolean.valueOf(false));
    }
    return _xblockexpression;
  }

  private CharSequence convertTermToCharSequence(final Term term, final Boolean needBreaks) {
    StringConcatenation _builder = new StringConcatenation();
    String _convertTermToStringWithSemicolon = this.convertTermToStringWithSemicolon(term, needBreaks);
    _builder.append(_convertTermToStringWithSemicolon);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  private String convertTermToStringWithSemicolon(final Term term, final Boolean needBreaks) {
    String _convertTermToString = this.convertTermToString(term, needBreaks);
    return (_convertTermToString + ";");
  }

  private String convertTermToString(final Term term, final Boolean needBreaks) {
    if ((needBreaks).booleanValue()) {
      if ((term instanceof OrTerm)) {
        String _convertTermToString = this.convertTermToString(((OrTerm)term).left, Boolean.valueOf(true));
        String _plus = ("(" + _convertTermToString);
        String _plus_1 = (_plus + " || ");
        String _convertTermToString_1 = this.convertTermToString(((OrTerm)term).right, Boolean.valueOf(true));
        String _plus_2 = (_plus_1 + _convertTermToString_1);
        return (_plus_2 + ")");
      }
      if ((term instanceof AndTerm)) {
        String _convertTermToString_2 = this.convertTermToString(((AndTerm)term).left, Boolean.valueOf(true));
        String _plus_3 = ("(" + _convertTermToString_2);
        String _plus_4 = (_plus_3 + " && ");
        String _convertTermToString_3 = this.convertTermToString(((AndTerm)term).right, Boolean.valueOf(true));
        String _plus_5 = (_plus_4 + _convertTermToString_3);
        return (_plus_5 + ")");
      }
    }
    if ((term instanceof OrTerm)) {
      String _convertTermToString_4 = this.convertTermToString(((OrTerm)term).left, Boolean.valueOf(true));
      String _plus_6 = (_convertTermToString_4 + " || ");
      String _convertTermToString_5 = this.convertTermToString(((OrTerm)term).right, Boolean.valueOf(true));
      return (_plus_6 + _convertTermToString_5);
    }
    if ((term instanceof AndTerm)) {
      String _convertTermToString_6 = this.convertTermToString(((AndTerm)term).left, Boolean.valueOf(true));
      String _plus_7 = (_convertTermToString_6 + " && ");
      String _convertTermToString_7 = this.convertTermToString(((AndTerm)term).right, Boolean.valueOf(true));
      return (_plus_7 + _convertTermToString_7);
    }
    if ((term instanceof BoolTerm)) {
      return String.valueOf(((BoolTerm)term).value);
    }
    if ((term instanceof VarTerm)) {
      return ("vars->" + ((VarTerm)term).name);
    }
    if ((term instanceof NotTerm)) {
      String _convertTermToString_8 = this.convertTermToString(((NotTerm)term).term, Boolean.valueOf(true));
      return ("!" + _convertTermToString_8);
    }
    if ((term instanceof FeTerm)) {
      Term termTerm = ((FeTerm)term).term;
      if ((termTerm instanceof VarTerm)) {
        return (((("fe(vars->prev_" + ((VarTerm)termTerm).name) + ", vars->") + ((VarTerm)termTerm).name) + ")");
      }
    }
    if ((term instanceof ReTerm)) {
      Term termTerm_1 = ((ReTerm)term).term;
      if ((termTerm_1 instanceof VarTerm)) {
        return (((("re(vars->prev_" + ((VarTerm)termTerm_1).name) + ", vars->") + ((VarTerm)termTerm_1).name) + ")");
      }
    }
    if ((term instanceof HighTerm)) {
      Term termTerm_2 = ((HighTerm)term).term;
      if ((termTerm_2 instanceof VarTerm)) {
        return (((("high(vars->prev_" + ((VarTerm)termTerm_2).name) + ", vars->") + ((VarTerm)termTerm_2).name) + ")");
      }
    }
    if ((term instanceof LowTerm)) {
      Term termTerm_3 = ((LowTerm)term).term;
      if ((termTerm_3 instanceof VarTerm)) {
        return (((("low(vars->prev_" + ((VarTerm)termTerm_3).name) + ", vars->") + ((VarTerm)termTerm_3).name) + ")");
      }
    }
    if ((term instanceof TimeTerm)) {
      return "TAU";
    }
    return null;
  }

  private CharSequence compileCheckRequirements(final EList<Requirement> reqs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("///////////// REQUIREMENTS VERIFICATION //////////////");
    _builder.newLine();
    _builder.append("//////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool check_requirement(void (*calc_attrs)(Requirement*, Vars*));");
    _builder.newLine();
    _builder.newLine();
    {
      if ((reqs != null)) {
        {
          for(final Requirement req : reqs) {
            CharSequence _compileCheckRequirement = this.compileCheckRequirement(req);
            _builder.append(_compileCheckRequirement);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  private CharSequence compileCheckRequirement(final Requirement req) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bool check_requirement_");
    String _name = req.getName();
    _builder.append(_name);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("return check_requirement(calc_attrs_for_req_");
    String _name_1 = req.getName();
    _builder.append(_name_1, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileAlgorithm() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bool a(Requirement* req, Vars* vars, void (*calc_attrs)(Requirement*, Vars*));");
    _builder.newLine();
    _builder.append("bool b(Requirement* req, Vars* vars, void (*calc_attrs)(Requirement*, Vars*));");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool check_requirement(void (*calc_attrs)(Requirement*, Vars*)) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Vars vars;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Requirement req;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("init_vars(&vars);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("while(true) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("calc_attrs(&req, &vars);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!req.trigger) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("update_vars(&vars);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("continue;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return a(&req, &vars, calc_attrs);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool a(Requirement* req, Vars* vars, void (*calc_attrs)(Requirement*, Vars*)) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("while (true) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (req->release) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (req->final) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return b(req, vars, calc_attrs);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!req->invariant) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("printf(\"a(): not final and not invariant\\n\");");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("update_vars(vars);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("calc_attrs(req, vars);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool b(Requirement* req, Vars* vars, void (*calc_attrs)(Requirement*, Vars*)) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("while (true) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (req->delay) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (!req->invariant) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("printf(\"b(): delay, but not invariant\\n\");");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (!req->reaction) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("printf(\"b(): delay, but not reaction\\n\");");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!req->invariant) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("printf(\"b(): not delay and not invariant\\n\");");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (req->reaction) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("update_vars(vars);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("calc_attrs(req, vars);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (req->release) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void verify_requirement(char* req_name, bool (*check_req)(void)) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("printf(\"Verifying requirement \\\'%s\\\'\\n\", req_name);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("bool success = check_req();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (success) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("printf(\"Verification for requirement \\\'%s\\\' has succeeded\", req_name);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("printf(\"Verification for requirement \\\'%s\\\' has failed\", req_name);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("printf(\"\\n\\n\");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileMain(final EList<Requirement> reqs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int main(int argc, char *argv[]) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("srand(time(NULL)); ");
    _builder.newLine();
    {
      for(final Requirement req : reqs) {
        _builder.append("    ");
        _builder.append("verify_requirement(\"");
        String _name = req.getName();
        _builder.append(_name, "    ");
        _builder.append("\", check_requirement_");
        String _name_1 = req.getName();
        _builder.append(_name_1, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
