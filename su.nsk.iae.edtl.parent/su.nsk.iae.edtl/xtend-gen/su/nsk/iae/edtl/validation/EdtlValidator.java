/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.edtl.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Function;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import su.nsk.iae.edtl.edtl.Abbr;
import su.nsk.iae.edtl.edtl.AndExpression;
import su.nsk.iae.edtl.edtl.CrossVarAbbr;
import su.nsk.iae.edtl.edtl.DeclVarInput;
import su.nsk.iae.edtl.edtl.DeclVarOutput;
import su.nsk.iae.edtl.edtl.EdtlPackage;
import su.nsk.iae.edtl.edtl.Expression;
import su.nsk.iae.edtl.edtl.GlobInterval;
import su.nsk.iae.edtl.edtl.Macros;
import su.nsk.iae.edtl.edtl.Model;
import su.nsk.iae.edtl.edtl.PrimaryExpression;
import su.nsk.iae.edtl.edtl.Requirement;
import su.nsk.iae.edtl.edtl.TauExpression;
import su.nsk.iae.edtl.edtl.UnExpression;
import su.nsk.iae.edtl.edtl.VarAssign;
import su.nsk.iae.edtl.edtl.VarDeclaration;
import su.nsk.iae.edtl.edtl.Variable;

@SuppressWarnings("all")
public class EdtlValidator extends AbstractEdtlValidator {
  private final EdtlPackage ePackage = EdtlPackage.eINSTANCE;

  /**
   * ======================= START REPETITION CHECKS =======================
   */
  @Check
  public void checkVariable_VarDeclarationRepetition(final Variable ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    if ((this.checkVarRepetition_DeclVarInput(model.getDeclVarInput(), ele) || 
      this.checkVarRepetition_DeclVarOutput(model.getDeclVarOutput(), ele))) {
      this.error("Variable name is duplicate", this.ePackage.getCrossVarAbbr_Name());
      return;
    }
  }

  private boolean checkVarRepetition_DeclVarInput(final EList<DeclVarInput> declVarInputs, final Variable ele) {
    final Predicate<DeclVarInput> _function = (DeclVarInput x) -> {
      return this.checkVarRepetiotion_VarDeclaration(x.getVarDecls(), ele);
    };
    return declVarInputs.stream().anyMatch(_function);
  }

  private boolean checkVarRepetition_DeclVarOutput(final EList<DeclVarOutput> declVarOutputs, final Variable ele) {
    final Predicate<DeclVarOutput> _function = (DeclVarOutput x) -> {
      return this.checkVarRepetiotion_VarDeclaration(x.getVarDecls(), ele);
    };
    return declVarOutputs.stream().anyMatch(_function);
  }

  private boolean checkVarRepetiotion_VarDeclaration(final EList<VarDeclaration> varDecls, final Variable ele) {
    final Function<VarDeclaration, Variable> _function = (VarDeclaration x) -> {
      return x.getV();
    };
    final Predicate<Variable> _function_1 = (Variable x) -> {
      return ((x != ele) && 
        x.getName().equals(ele.getName()));
    };
    return varDecls.stream().<Variable>map(_function).anyMatch(_function_1);
  }

  @Check
  public void checkRequirement_RequirementRepetition(final Requirement ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    boolean _checkRequirementRepetition = this.checkRequirementRepetition(model.getReqs(), ele);
    if (_checkRequirementRepetition) {
      this.error("Requirement name is duplicate", this.ePackage.getRequirement_Name());
      return;
    }
  }

  private boolean checkRequirementRepetition(final EList<Requirement> reqs, final Requirement ele) {
    final Predicate<Requirement> _function = (Requirement x) -> {
      return ((x != ele) && 
        x.getName().equals(ele.getName()));
    };
    return reqs.stream().anyMatch(_function);
  }

  @Check
  public void checkAbbr_AbbrRepetition(final Abbr ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    boolean _checkAbbrRepetition = this.checkAbbrRepetition(model.getAbbrs(), ele);
    if (_checkAbbrRepetition) {
      this.error("Abbr name is duplicate", this.ePackage.getCrossVarAbbr_Name());
      return;
    }
  }

  private boolean checkAbbrRepetition(final EList<Abbr> abbrs, final Abbr ele) {
    final Predicate<Abbr> _function = (Abbr x) -> {
      return ((x != ele) && 
        x.getName().equals(ele.getName()));
    };
    return abbrs.stream().anyMatch(_function);
  }

  @Check
  public void checkMacros_MacrosRepetition(final Macros ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    boolean _checkMacrosRepetition = this.checkMacrosRepetition(model.getMacroses(), ele);
    if (_checkMacrosRepetition) {
      this.error("Macros name is duplicate", this.ePackage.getMacros_Name());
      return;
    }
  }

  private boolean checkMacrosRepetition(final EList<Macros> macroses, final Macros ele) {
    final Predicate<Macros> _function = (Macros x) -> {
      return ((x != ele) && 
        x.getName().equals(ele.getName()));
    };
    return macroses.stream().anyMatch(_function);
  }

  /**
   * VARIABLES
   */
  @Check
  public void checkNameConflicts(final Variable ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    boolean _checkNameConflictsVariable = this.checkNameConflictsVariable(model, ele.getName());
    if (_checkNameConflictsVariable) {
      this.error("Name conflicts", this.ePackage.getCrossVarAbbr_Name());
      return;
    }
  }

  private boolean checkNameConflictsVariable(final Model model, final String name) {
    return ((this.checkNameConflicts_Abbr(model.getAbbrs(), name) || 
      this.checkNameConflicts_Macros(model.getMacroses(), name)) || 
      this.checkNameConflicts_Req(model.getReqs(), name));
  }

  private boolean checkNameConflicts_Abbr(final EList<Abbr> abbrs, final String name) {
    final Function<Abbr, String> _function = (Abbr x) -> {
      return x.getName();
    };
    final Predicate<String> _function_1 = (String x) -> {
      return x.equals(name);
    };
    return abbrs.stream().<String>map(_function).anyMatch(_function_1);
  }

  private boolean checkNameConflicts_Macros(final EList<Macros> macroses, final String name) {
    final Function<Macros, String> _function = (Macros x) -> {
      return x.getName();
    };
    final Predicate<String> _function_1 = (String x) -> {
      return x.equals(name);
    };
    return macroses.stream().<String>map(_function).anyMatch(_function_1);
  }

  private boolean checkNameConflicts_Req(final EList<Requirement> reqs, final String name) {
    final Function<Requirement, String> _function = (Requirement x) -> {
      return x.getName();
    };
    final Predicate<String> _function_1 = (String x) -> {
      return x.equals(name);
    };
    return reqs.stream().<String>map(_function).anyMatch(_function_1);
  }

  @Check
  public void checkNameConflicts(final Requirement ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    boolean _checkNameConflicts_Req = this.checkNameConflicts_Req(model, ele.getName());
    if (_checkNameConflicts_Req) {
      this.error("Name conflicts", this.ePackage.getRequirement_Name());
      return;
    }
  }

  private boolean checkNameConflicts_Req(final Model model, final String name) {
    return ((this.checkNameConflicts_Abbr(model.getAbbrs(), name) || 
      this.checkNameConflicts_Macros(model.getMacroses(), name)) || 
      this.checkNameConflicts_Variable(model, name));
  }

  private boolean checkNameConflicts_Variable(final Model model, final String name) {
    return (this.checkNameConflicts_DeclVarInput(model.getDeclVarInput(), name) || 
      this.checkNameConflicts_DeclVarOutput(model.getDeclVarOutput(), name));
  }

  private boolean checkNameConflicts_DeclVarInput(final EList<DeclVarInput> varDecls, final String name) {
    final Predicate<DeclVarInput> _function = (DeclVarInput x) -> {
      return this.checkNameConflicts_VarDeclaration(x.getVarDecls(), name);
    };
    return varDecls.stream().anyMatch(_function);
  }

  private boolean checkNameConflicts_DeclVarOutput(final EList<DeclVarOutput> varDecls, final String name) {
    final Predicate<DeclVarOutput> _function = (DeclVarOutput x) -> {
      return this.checkNameConflicts_VarDeclaration(x.getVarDecls(), name);
    };
    return varDecls.stream().anyMatch(_function);
  }

  private boolean checkNameConflicts_VarDeclaration(final EList<VarDeclaration> varDecls, final String name) {
    final Function<VarDeclaration, Variable> _function = (VarDeclaration x) -> {
      return x.getV();
    };
    final Predicate<Variable> _function_1 = (Variable x) -> {
      return x.getName().equals(name);
    };
    return varDecls.stream().<Variable>map(_function).anyMatch(_function_1);
  }

  /**
   * ABBRS
   */
  @Check
  public void checkNameConflicts(final Abbr ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    boolean _checkNameConflicts_Abbr = this.checkNameConflicts_Abbr(model, ele.getName());
    if (_checkNameConflicts_Abbr) {
      this.error("Name conflicts", this.ePackage.getCrossVarAbbr_Name());
      return;
    }
  }

  private boolean checkNameConflicts_Abbr(final Model model, final String name) {
    return ((this.checkNameConflicts_Req(model.getReqs(), name) || 
      this.checkNameConflicts_Macros(model.getMacroses(), name)) || 
      this.checkNameConflicts_Variable(model, name));
  }

  /**
   * MACROSES
   */
  @Check
  public void checkNameConflicts(final Macros ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    boolean _checkNameConflicts_Macros = this.checkNameConflicts_Macros(model, ele.getName());
    if (_checkNameConflicts_Macros) {
      this.error("Name conflicts", this.ePackage.getMacros_Name());
      return;
    }
  }

  private boolean checkNameConflicts_Macros(final Model model, final String name) {
    return ((this.checkNameConflicts_Req(model.getReqs(), name) || 
      this.checkNameConflicts_Abbr(model.getAbbrs(), name)) || 
      this.checkNameConflicts_Variable(model, name));
  }

  /**
   * ======================= START VAR ASSIGN CKECKS =======================
   */
  @Check
  public void checkVariable_Assign(final VarAssign ele) {
    boolean _equals = EcoreUtil2.<VarDeclaration>getContainerOfType(ele.getVariable(), VarDeclaration.class).getType().equals("BOOL");
    if (_equals) {
      boolean _not = (!(ele.getValue().equals("TRUE") || ele.getValue().equals("FALSE")));
      if (_not) {
        this.error("Wrong value", this.ePackage.getVarAssign_Value());
      }
    }
    boolean _equals_1 = EcoreUtil2.<VarDeclaration>getContainerOfType(ele.getVariable(), VarDeclaration.class).getType().equals("INT");
    if (_equals_1) {
      if ((ele.getValue().equals("TRUE") || ele.getValue().equals("FALSE"))) {
        this.error("Wrong value", this.ePackage.getVarAssign_Value());
      }
    }
  }

  /**
   * ======================= START ABBR CKECKS =======================
   */
  @Check
  public void checkAbbr_Expressions(final PrimaryExpression ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    boolean _checkAbbrs_ExpressionMacrosesAbbrs = this.checkAbbrs_ExpressionMacrosesAbbrs(model.getAbbrs(), ele);
    if (_checkAbbrs_ExpressionMacrosesAbbrs) {
      this.error("Macroses and Abbrs in abbreviations are not available", this.ePackage.getPrimaryExpression_Macros());
      return;
    }
  }

  private boolean checkAbbrs_ExpressionMacrosesAbbrs(final EList<Abbr> abbrs, final PrimaryExpression ele) {
    final Predicate<Abbr> _function = (Abbr x) -> {
      return (this.hasMacroses(x.getExpr(), ele) || this.hasAbbrs(x.getExpr(), ele));
    };
    return abbrs.stream().anyMatch(_function);
  }

  private boolean hasAbbrs(final Expression expr, final PrimaryExpression ele) {
    final CrossVarAbbr abbr = ele.getV();
    if (((abbr == null) || (abbr instanceof Variable))) {
      return false;
    }
    if ((abbr instanceof Abbr)) {
      boolean _contains = expr.eCrossReferences().contains(abbr);
      if (_contains) {
        return true;
      } else {
        return (this.checkAbbrs_AbbrTraversal(expr.getLeft(), ((Abbr) abbr)) || 
          this.checkAbbrs_AbbrTraversal(expr.getRight(), ((Abbr) abbr)));
      }
    } else {
      return false;
    }
  }

  private boolean checkAbbrs_AbbrTraversal(final Expression expr, final Abbr abbr) {
    if ((expr == null)) {
      return false;
    }
    boolean _contains = expr.eCrossReferences().contains(abbr);
    if (_contains) {
      return true;
    } else {
      return (this.checkAbbrs_AbbrTraversal(expr.getLeft(), abbr) || 
        this.checkAbbrs_AbbrTraversal(expr.getRight(), abbr));
    }
  }

  private boolean hasMacroses(final Expression expr, final PrimaryExpression ele) {
    final Macros macros = ele.getMacros();
    if ((macros == null)) {
      return false;
    }
    boolean _contains = expr.eCrossReferences().contains(macros);
    if (_contains) {
      return true;
    } else {
      return (this.checkAbbrs_MacrosTraversal(expr.getLeft(), macros) || 
        this.checkAbbrs_MacrosTraversal(expr.getRight(), macros));
    }
  }

  private boolean checkAbbrs_MacrosTraversal(final Expression expr, final Macros macros) {
    if ((expr == null)) {
      return false;
    }
    boolean _contains = expr.eCrossReferences().contains(macros);
    if (_contains) {
      return true;
    } else {
      return (this.checkAbbrs_MacrosTraversal(expr.getLeft(), macros) || 
        this.checkAbbrs_MacrosTraversal(expr.getRight(), macros));
    }
  }

  /**
   * ======================= START USE CKECKS =======================
   */
  @Check
  public void checkSymbolicVariable_NeverUse(final Variable ele) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    boolean _hasCrossReferences = this.hasCrossReferences(model, ele);
    boolean _not = (!_hasCrossReferences);
    if (_not) {
      this.warning("Variable is never used", this.ePackage.getCrossVarAbbr_Name());
    }
  }

  private boolean hasCrossReferences(final EObject context, final EObject target) {
    final HashSet<EObject> targetSet = new HashSet<EObject>();
    targetSet.add(target);
    final ArrayList<EReference> res = new ArrayList<EReference>();
    final EcoreUtil2.ElementReferenceAcceptor _function = (EObject referrer, EObject referenced, EReference reference, int index) -> {
      res.add(reference);
    };
    final EcoreUtil2.ElementReferenceAcceptor acceptor = _function;
    EcoreUtil2.findCrossReferences(context, targetSet, acceptor);
    boolean _isEmpty = res.isEmpty();
    return (!_isEmpty);
  }

  @Check
  public void checkAvailabilityOfIntervalForTau(final PrimaryExpression ele) {
    final TauExpression tau = ele.getTau();
    if ((tau == null)) {
      return;
    }
    final Model model = EcoreUtil2.<Model>getContainerOfType(ele, Model.class);
    GlobInterval _globInterval = model.getGlobInterval();
    boolean _tripleEquals = (_globInterval == null);
    if (_tripleEquals) {
      this.error("INTERVAL must be set", this.ePackage.getPrimaryExpression_Tau());
    }
  }

  /**
   * ======================= START OPERATION STYLE CKECKS =======================
   */
  @Check
  public void checkOperatorStyle(final Model ele) {
    final ArrayList<Integer> oprs = new ArrayList<Integer>();
    final ArrayList<Integer> pascal = new ArrayList<Integer>();
    final ArrayList<Integer> symb = new ArrayList<Integer>();
    final Predicate<Requirement> _function = (Requirement x) -> {
      return this.checkOperatorStyle_Req(x, oprs, pascal, symb);
    };
    ele.getReqs().stream().anyMatch(_function);
    final Predicate<Abbr> _function_1 = (Abbr x) -> {
      return this.checkOperatorStyle_Abbr(x, oprs, pascal, symb);
    };
    ele.getAbbrs().stream().anyMatch(_function_1);
    final Predicate<Macros> _function_2 = (Macros x) -> {
      return this.checkOperatorStyle_Macros(x, oprs, pascal, symb);
    };
    ele.getMacroses().stream().anyMatch(_function_2);
    boolean _contains = oprs.contains(Integer.valueOf((-1)));
    if (_contains) {
      this.warning("Write code in one style is recommended", this.ePackage.getModel_Reqs());
      this.warning("Write code in one style is recommended", this.ePackage.getModel_Abbrs());
      this.warning("Write code in one style is recommended", this.ePackage.getModel_Macroses());
    }
    for (final Integer a : oprs) {
      {
        boolean _equals = a.equals(Integer.valueOf(1));
        if (_equals) {
          pascal.add(a);
        }
        boolean _equals_1 = a.equals(Integer.valueOf(2));
        if (_equals_1) {
          symb.add(a);
        }
      }
    }
    if (((pascal.size() != 0) && (symb.size() != 0))) {
      this.warning("Write code in one style is recommended", this.ePackage.getModel_Reqs());
      this.warning("Write code in one style is recommended", this.ePackage.getModel_Abbrs());
      this.warning("Write code in one style is recommended", this.ePackage.getModel_Macroses());
    }
  }

  private boolean checkOperatorStyle_Abbr(final Abbr abbr, final ArrayList<Integer> oprs, final ArrayList<Integer> pascal, final ArrayList<Integer> symb) {
    return oprs.add(Integer.valueOf(this.checkOperatorStyle_Traversal(abbr.getExpr(), false, false)));
  }

  private boolean checkOperatorStyle_Macros(final Macros macros, final ArrayList<Integer> oprs, final ArrayList<Integer> pascal, final ArrayList<Integer> symb) {
    return oprs.add(Integer.valueOf(this.checkOperatorStyle_Traversal(macros.getExpr(), false, false)));
  }

  private boolean checkOperatorStyle_Req(final Requirement req, final ArrayList<Integer> oprs, final ArrayList<Integer> pascal, final ArrayList<Integer> symb) {
    boolean _xblockexpression = false;
    {
      oprs.add(Integer.valueOf(this.checkOperatorStyle_Traversal(req.getTrigExpr(), false, false)));
      oprs.add(Integer.valueOf(this.checkOperatorStyle_Traversal(req.getInvExpr(), false, false)));
      oprs.add(Integer.valueOf(this.checkOperatorStyle_Traversal(req.getFinalExpr(), false, false)));
      oprs.add(Integer.valueOf(this.checkOperatorStyle_Traversal(req.getDelayExpr(), false, false)));
      oprs.add(Integer.valueOf(this.checkOperatorStyle_Traversal(req.getReacExpr(), false, false)));
      _xblockexpression = oprs.add(Integer.valueOf(this.checkOperatorStyle_Traversal(req.getRelExpr(), false, false)));
    }
    return _xblockexpression;
  }

  private int checkOperatorStyle_Traversal(final Expression expr, final boolean isPascalStyle, final boolean isSymbStyle) {
    boolean pascal = isPascalStyle;
    boolean symb = isSymbStyle;
    if ((isPascalStyle && isSymbStyle)) {
      return (-1);
    }
    if ((expr == null)) {
      if (isPascalStyle) {
        return 1;
      }
      if (isSymbStyle) {
        return 2;
      }
      return 0;
    }
    String _orOp = expr.getOrOp();
    if (_orOp != null) {
      switch (_orOp) {
        case "OR":
          pascal = true;
          break;
        case "||":
          symb = true;
          break;
      }
    }
    if ((expr instanceof UnExpression)) {
      UnExpression unExpr = ((UnExpression) expr);
      String _unOp = unExpr.getUnOp();
      if (_unOp != null) {
        switch (_unOp) {
          case "NOT":
            pascal = true;
            break;
          case "!":
            symb = true;
            break;
        }
      }
    }
    if ((expr instanceof AndExpression)) {
      AndExpression andExpr = ((AndExpression) expr);
      String _andOp = andExpr.getAndOp();
      if (_andOp != null) {
        switch (_andOp) {
          case "AND":
            pascal = true;
            break;
          case "&&":
            symb = true;
            break;
        }
      }
    }
    final int l = this.checkOperatorStyle_Traversal(expr.getLeft(), pascal, symb);
    final int r = this.checkOperatorStyle_Traversal(expr.getRight(), pascal, symb);
    if (((l == (-1)) || (r == (-1)))) {
      return (-1);
    }
    if (((l == 1) && (r == 1))) {
      return 1;
    }
    if (((l == 2) && (r == 2))) {
      return 2;
    }
    if ((l == 0)) {
      return r;
    }
    if ((r == 0)) {
      return l;
    } else {
      return (-1);
    }
  }
}
