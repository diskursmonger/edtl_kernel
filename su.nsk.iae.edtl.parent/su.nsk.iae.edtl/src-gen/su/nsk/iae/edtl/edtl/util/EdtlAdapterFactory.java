/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.edtl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import su.nsk.iae.edtl.edtl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see su.nsk.iae.edtl.edtl.EdtlPackage
 * @generated
 */
public class EdtlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EdtlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdtlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EdtlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdtlSwitch<Adapter> modelSwitch =
    new EdtlSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseDeclVarInput(DeclVarInput object)
      {
        return createDeclVarInputAdapter();
      }
      @Override
      public Adapter caseDeclVarOutput(DeclVarOutput object)
      {
        return createDeclVarOutputAdapter();
      }
      @Override
      public Adapter caseVarDeclaration(VarDeclaration object)
      {
        return createVarDeclarationAdapter();
      }
      @Override
      public Adapter caseVarInit(VarInit object)
      {
        return createVarInitAdapter();
      }
      @Override
      public Adapter caseVarAssign(VarAssign object)
      {
        return createVarAssignAdapter();
      }
      @Override
      public Adapter caseAbbr(Abbr object)
      {
        return createAbbrAdapter();
      }
      @Override
      public Adapter caseMacros(Macros object)
      {
        return createMacrosAdapter();
      }
      @Override
      public Adapter caseVarList(VarList object)
      {
        return createVarListAdapter();
      }
      @Override
      public Adapter caseGlobInterval(GlobInterval object)
      {
        return createGlobIntervalAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseXorExpression(XorExpression object)
      {
        return createXorExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseCompExpression(CompExpression object)
      {
        return createCompExpressionAdapter();
      }
      @Override
      public Adapter caseEquExpression(EquExpression object)
      {
        return createEquExpressionAdapter();
      }
      @Override
      public Adapter caseUnExpression(UnExpression object)
      {
        return createUnExpressionAdapter();
      }
      @Override
      public Adapter caseTauExpression(TauExpression object)
      {
        return createTauExpressionAdapter();
      }
      @Override
      public Adapter caseTimeLiteral(TimeLiteral object)
      {
        return createTimeLiteralAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseParamAssignmentElements(ParamAssignmentElements object)
      {
        return createParamAssignmentElementsAdapter();
      }
      @Override
      public Adapter caseCrossVarAbbr(CrossVarAbbr object)
      {
        return createCrossVarAbbrAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.DeclVarInput <em>Decl Var Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.DeclVarInput
   * @generated
   */
  public Adapter createDeclVarInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.DeclVarOutput <em>Decl Var Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.DeclVarOutput
   * @generated
   */
  public Adapter createDeclVarOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.VarDeclaration <em>Var Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.VarDeclaration
   * @generated
   */
  public Adapter createVarDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.VarInit <em>Var Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.VarInit
   * @generated
   */
  public Adapter createVarInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.VarAssign <em>Var Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.VarAssign
   * @generated
   */
  public Adapter createVarAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.Abbr <em>Abbr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.Abbr
   * @generated
   */
  public Adapter createAbbrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.Macros <em>Macros</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.Macros
   * @generated
   */
  public Adapter createMacrosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.VarList <em>Var List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.VarList
   * @generated
   */
  public Adapter createVarListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.GlobInterval <em>Glob Interval</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.GlobInterval
   * @generated
   */
  public Adapter createGlobIntervalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.XorExpression <em>Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.XorExpression
   * @generated
   */
  public Adapter createXorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.CompExpression <em>Comp Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.CompExpression
   * @generated
   */
  public Adapter createCompExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.EquExpression <em>Equ Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.EquExpression
   * @generated
   */
  public Adapter createEquExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.UnExpression <em>Un Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.UnExpression
   * @generated
   */
  public Adapter createUnExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.TauExpression <em>Tau Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.TauExpression
   * @generated
   */
  public Adapter createTauExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.TimeLiteral <em>Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.TimeLiteral
   * @generated
   */
  public Adapter createTimeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.ParamAssignmentElements <em>Param Assignment Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.ParamAssignmentElements
   * @generated
   */
  public Adapter createParamAssignmentElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link su.nsk.iae.edtl.edtl.CrossVarAbbr <em>Cross Var Abbr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see su.nsk.iae.edtl.edtl.CrossVarAbbr
   * @generated
   */
  public Adapter createCrossVarAbbrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EdtlAdapterFactory
