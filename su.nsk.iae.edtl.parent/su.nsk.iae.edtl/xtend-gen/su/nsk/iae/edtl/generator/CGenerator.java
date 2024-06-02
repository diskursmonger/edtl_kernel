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
    CharSequence _compileTimeFunctions = this.compileTimeFunctions();
    _builder.append(_compileTimeFunctions);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileEdtlOperators = this.compileEdtlOperators();
    _builder.append(_compileEdtlOperators);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileVars = this.compileVars(ast.getDeclVarInput(), ast.getDeclVarOutput());
    _builder.append(_compileVars);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileRequirementCheckContext = this.compileRequirementCheckContext();
    _builder.append(_compileRequirementCheckContext);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileGeneralRequirementCheckFunction = this.compileGeneralRequirementCheckFunction();
    _builder.append(_compileGeneralRequirementCheckFunction);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileSpecificRequirementCheckFunctions = this.compileSpecificRequirementCheckFunctions(ast.getReqs());
    _builder.append(_compileSpecificRequirementCheckFunctions);
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
    return _builder;
  }

  private CharSequence compileTimeFunctions() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("///////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("///////////////// TIME FUNCTIONS //////////////////");
    _builder.newLine();
    _builder.append("///////////////////////////////////////////////////");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifdef __WIN32__");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <time.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("uint64_t get_epoch_millis() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("struct timespec ts;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("timespec_get(&ts, TIME_UTC);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (uint64_t)ts.tv_sec * 1000 + (uint64_t)ts.tv_nsec / 1000000");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#else");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <sys/time.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("uint64_t get_current_time_millis() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("struct timeval tv;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("gettimeofday(&tv, NULL);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (uint64_t)tv.tv_sec * 1000 + (uint64_t)tv.tv_usec / 1000;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif");
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
    _builder.append("return !prev_v && v;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool fe(bool prev_v, bool v) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return prev_v && !v;");
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
        _builder.append("bool ");
        String _name = varDecl.getV().getName();
        _builder.append(_name, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("} Vars;");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileRequirementCheckContext() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("///////////// REQUIREMENT CHECK CONTEXT //////////////");
    _builder.newLine();
    _builder.append("//////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct times {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("uint64_t curr_time;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("uint64_t prog_time;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("uint64_t trigger_time;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("uint64_t final_time;");
    _builder.newLine();
    _builder.append("} Times;");
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
    _builder.newLine();
    _builder.append("typedef enum state {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("WAIT_TRIGGER,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("WAIT_FINAL,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("WAIT_DELAY");
    _builder.newLine();
    _builder.append("} State;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct context {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Vars vars;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Vars prev_vars;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("bool vars_are_set;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Times times;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Requirement requirement;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("State state;");
    _builder.newLine();
    _builder.append("} Context;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Context create_context() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (Context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(".vars_are_set = false,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(".times = { .prog_time = get_current_time_millis() },");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(".requirement = {},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(".state = WAIT_TRIGGER,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void set_vars_to_context(Context* context, Vars vars) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (context->vars_are_set) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("context->prev_vars = context->vars;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("context->vars = vars;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("context->vars = context->prev_vars = vars;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("context->vars_are_set = true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void reset_context(Context* context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("context->times = (Times) { .prog_time = context->times.prog_time };");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("context->requirement = (Requirement) {};");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("context->state = WAIT_TRIGGER;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileGeneralRequirementCheckFunction() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("///////////// GENERAL REQUIREMENT CHECK FUNCTION ///////////////");
    _builder.newLine();
    _builder.append("////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef enum result {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("SUCCESS,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("FAIL,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("CONTINUE");
    _builder.newLine();
    _builder.append("} Result;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Result check_requirement(Context* context, void (*calculate_requirement_attributes)(Context*)) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Times* times = &context->times;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Requirement* requirement = &context->requirement;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("times->curr_time = get_current_time_millis();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("switch (context->state) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("case WAIT_TRIGGER: {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("calculate_requirement_attributes(context);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (!requirement->trigger) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return CONTINUE;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("context->state = WAIT_FINAL;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("times->trigger_time = times->curr_time;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("case WAIT_FINAL: {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("calculate_requirement_attributes(context);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (requirement->release) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return SUCCESS;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (!requirement->final) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (requirement->invariant) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("return CONTINUE;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return FAIL;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("context->state = WAIT_DELAY;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("times->final_time = times->curr_time;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("case WAIT_DELAY: {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("calculate_requirement_attributes(context);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (requirement->release) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return SUCCESS;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (requirement->delay) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (!requirement->invariant) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("return FAIL;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (!requirement->reaction) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("return FAIL;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return SUCCESS;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (!requirement->invariant) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return FAIL;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (requirement->reaction) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return SUCCESS;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return CONTINUE;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return FAIL;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  private CharSequence compileSpecificRequirementCheckFunctions(final EList<Requirement> reqs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.append("///////////// SPECIFIC REQUIREMENT CHECK FUNCTIONS ///////////////");
    _builder.newLine();
    _builder.append("//////////////////////////////////////////////////////////////////");
    _builder.newLine();
    _builder.newLine();
    {
      if ((reqs != null)) {
        {
          for(final Requirement req : reqs) {
            CharSequence _compileSpecificRequirementCheckFunction = this.compileSpecificRequirementCheckFunction(req);
            _builder.append(_compileSpecificRequirementCheckFunction);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  private CharSequence compileSpecificRequirementCheckFunction(final Requirement req) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void calculate_attributes_for_");
    String _name = req.getName();
    _builder.append(_name);
    _builder.append("(Context* context) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("Vars* vars = &context->vars;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Vars* prev_vars = &context->prev_vars;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Times* times = &context->times;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Requirement* req = &context->requirement;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("switch (context->state) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("case WAIT_DELAY: {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("req->delay = ");
    CharSequence _convertDelayToCharSequence = this.convertDelayToCharSequence(req.getDelayExpr());
    _builder.append(_convertDelayToCharSequence, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("req->reaction = ");
    CharSequence _convertReactionToCharSequence = this.convertReactionToCharSequence(req.getReacExpr());
    _builder.append(_convertReactionToCharSequence, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("case WAIT_FINAL: {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("req->invariant = ");
    CharSequence _convertInvariantToCharSequence = this.convertInvariantToCharSequence(req.getInvExpr());
    _builder.append(_convertInvariantToCharSequence, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("req->final = ");
    CharSequence _convertFinalToCharSequence = this.convertFinalToCharSequence(req.getFinalExpr());
    _builder.append(_convertFinalToCharSequence, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("req->release = ");
    CharSequence _convertReleaseToCharSequence = this.convertReleaseToCharSequence(req.getRelExpr());
    _builder.append(_convertReleaseToCharSequence, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("case WAIT_TRIGGER: {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("req->trigger = ");
    CharSequence _convertTriggerToCharSequence = this.convertTriggerToCharSequence(req.getTrigExpr());
    _builder.append(_convertTriggerToCharSequence, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Result check_requirement_");
    String _name_1 = req.getName();
    _builder.append(_name_1);
    _builder.append("(Context* context) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("return check_requirement(context, calculate_attributes_for_");
    String _name_2 = req.getName();
    _builder.append(_name_2, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
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

  private CharSequence convertTermToCharSequence(final Term term, final Boolean needParentheses) {
    StringConcatenation _builder = new StringConcatenation();
    String _convertTermToStringWithSemicolon = this.convertTermToStringWithSemicolon(term, needParentheses);
    _builder.append(_convertTermToStringWithSemicolon);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  private String convertTermToStringWithSemicolon(final Term term, final Boolean needParentheses) {
    String _convertTermToString = this.convertTermToString(term, needParentheses, Boolean.valueOf(false));
    return (_convertTermToString + ";");
  }

  private String convertTermToString(final Term term, final Boolean needParentheses, final Boolean usePrevVars) {
    if ((term instanceof OrTerm)) {
      String _convertTermToString = this.convertTermToString(((OrTerm)term).left, Boolean.valueOf(true), usePrevVars);
      String _plus = (_convertTermToString + " || ");
      String _convertTermToString_1 = this.convertTermToString(((OrTerm)term).right, Boolean.valueOf(true), usePrevVars);
      String orString = (_plus + _convertTermToString_1);
      String _xifexpression = null;
      if ((needParentheses).booleanValue()) {
        _xifexpression = (("(" + orString) + ")");
      } else {
        _xifexpression = orString;
      }
      return _xifexpression;
    }
    if ((term instanceof AndTerm)) {
      String _convertTermToString_2 = this.convertTermToString(((AndTerm)term).left, Boolean.valueOf(true), usePrevVars);
      String _plus_1 = (_convertTermToString_2 + " && ");
      String _convertTermToString_3 = this.convertTermToString(((AndTerm)term).right, Boolean.valueOf(true), usePrevVars);
      String andString = (_plus_1 + _convertTermToString_3);
      String _xifexpression_1 = null;
      if ((needParentheses).booleanValue()) {
        _xifexpression_1 = (("(" + andString) + ")");
      } else {
        _xifexpression_1 = andString;
      }
      return _xifexpression_1;
    }
    if ((term instanceof BoolTerm)) {
      return String.valueOf(((BoolTerm)term).value);
    }
    if ((term instanceof VarTerm)) {
      String _xifexpression_2 = null;
      if ((usePrevVars).booleanValue()) {
        _xifexpression_2 = "prev_vars->";
      } else {
        _xifexpression_2 = "vars->";
      }
      return (_xifexpression_2 + ((VarTerm)term).name);
    }
    if ((term instanceof NotTerm)) {
      String _convertTermToString_4 = this.convertTermToString(((NotTerm)term).term, Boolean.valueOf(true), usePrevVars);
      return ("!" + _convertTermToString_4);
    }
    if ((term instanceof FeTerm)) {
      String _convertTermToString_5 = this.convertTermToString(((FeTerm)term).term, Boolean.valueOf(false), Boolean.valueOf(true));
      String _plus_2 = ("fe(" + _convertTermToString_5);
      String _plus_3 = (_plus_2 + ", ");
      String _convertTermToString_6 = this.convertTermToString(((FeTerm)term).term, Boolean.valueOf(false), Boolean.valueOf(false));
      String _plus_4 = (_plus_3 + _convertTermToString_6);
      return (_plus_4 + ")");
    }
    if ((term instanceof ReTerm)) {
      String _convertTermToString_7 = this.convertTermToString(((ReTerm)term).term, Boolean.valueOf(false), Boolean.valueOf(true));
      String _plus_5 = ("re(" + _convertTermToString_7);
      String _plus_6 = (_plus_5 + ", ");
      String _convertTermToString_8 = this.convertTermToString(((ReTerm)term).term, Boolean.valueOf(false), Boolean.valueOf(false));
      String _plus_7 = (_plus_6 + _convertTermToString_8);
      return (_plus_7 + ")");
    }
    if ((term instanceof HighTerm)) {
      String _convertTermToString_9 = this.convertTermToString(((HighTerm)term).term, Boolean.valueOf(false), Boolean.valueOf(true));
      String _plus_8 = ("high(" + _convertTermToString_9);
      String _plus_9 = (_plus_8 + ", ");
      String _convertTermToString_10 = this.convertTermToString(((HighTerm)term).term, Boolean.valueOf(false), Boolean.valueOf(false));
      String _plus_10 = (_plus_9 + _convertTermToString_10);
      return (_plus_10 + ")");
    }
    if ((term instanceof LowTerm)) {
      String _convertTermToString_11 = this.convertTermToString(((LowTerm)term).term, Boolean.valueOf(false), Boolean.valueOf(true));
      String _plus_11 = ("low(" + _convertTermToString_11);
      String _plus_12 = (_plus_11 + ", ");
      String _convertTermToString_12 = this.convertTermToString(((LowTerm)term).term, Boolean.valueOf(false), Boolean.valueOf(false));
      String _plus_13 = (_plus_12 + _convertTermToString_12);
      return (_plus_13 + ")");
    }
    if ((term instanceof TimeTerm)) {
      return this.buildTimeIntervalString(((TimeTerm)term).interval, ((TimeTerm)term).attribute, needParentheses);
    }
    if ((term instanceof NestTerm)) {
      return this.convertTermToString(((NestTerm)term).term, needParentheses, usePrevVars);
    }
    return null;
  }

  private String buildTimeIntervalString(final String timeInterval, final Attribute attribute, final Boolean needParentheses) {
    long timeIntervalMillis = TimeIntervalParser.parseTimeIntervalToMillis(timeInterval);
    String _switchResult = null;
    if (attribute != null) {
      switch (attribute) {
        case TRIGGER:
          _switchResult = "times->prog_time";
          break;
        case INVARIANT:
          _switchResult = "times->trigger_time";
          break;
        case FINAL:
          _switchResult = "times->trigger_time";
          break;
        case DELAY:
          _switchResult = "times->final_time";
          break;
        case REACTION:
          _switchResult = "times->final_time";
          break;
        case RELEASE:
          _switchResult = "times->trigger_time";
          break;
        default:
          break;
      }
    }
    String timeValue = _switchResult;
    String timeIntervalString = ((("times->curr_time >= " + timeValue) + " + ") + Long.valueOf(timeIntervalMillis));
    String _xifexpression = null;
    if ((needParentheses).booleanValue()) {
      _xifexpression = (("(" + timeIntervalString) + ")");
    } else {
      _xifexpression = timeIntervalString;
    }
    return _xifexpression;
  }
}
