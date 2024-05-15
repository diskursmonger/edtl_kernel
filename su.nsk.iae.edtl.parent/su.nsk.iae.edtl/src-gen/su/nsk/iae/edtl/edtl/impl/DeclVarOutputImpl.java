/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.edtl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import su.nsk.iae.edtl.edtl.DeclVarOutput;
import su.nsk.iae.edtl.edtl.EdtlPackage;
import su.nsk.iae.edtl.edtl.VarDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decl Var Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.DeclVarOutputImpl#getOutputCounter <em>Output Counter</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.DeclVarOutputImpl#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclVarOutputImpl extends MinimalEObjectImpl.Container implements DeclVarOutput
{
  /**
   * The default value of the '{@link #getOutputCounter() <em>Output Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputCounter()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_COUNTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutputCounter() <em>Output Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputCounter()
   * @generated
   * @ordered
   */
  protected String outputCounter = OUTPUT_COUNTER_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarDecls() <em>Var Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarDecls()
   * @generated
   * @ordered
   */
  protected EList<VarDeclaration> varDecls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclVarOutputImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EdtlPackage.Literals.DECL_VAR_OUTPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOutputCounter()
  {
    return outputCounter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOutputCounter(String newOutputCounter)
  {
    String oldOutputCounter = outputCounter;
    outputCounter = newOutputCounter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.DECL_VAR_OUTPUT__OUTPUT_COUNTER, oldOutputCounter, outputCounter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VarDeclaration> getVarDecls()
  {
    if (varDecls == null)
    {
      varDecls = new EObjectContainmentEList<VarDeclaration>(VarDeclaration.class, this, EdtlPackage.DECL_VAR_OUTPUT__VAR_DECLS);
    }
    return varDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EdtlPackage.DECL_VAR_OUTPUT__VAR_DECLS:
        return ((InternalEList<?>)getVarDecls()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EdtlPackage.DECL_VAR_OUTPUT__OUTPUT_COUNTER:
        return getOutputCounter();
      case EdtlPackage.DECL_VAR_OUTPUT__VAR_DECLS:
        return getVarDecls();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdtlPackage.DECL_VAR_OUTPUT__OUTPUT_COUNTER:
        setOutputCounter((String)newValue);
        return;
      case EdtlPackage.DECL_VAR_OUTPUT__VAR_DECLS:
        getVarDecls().clear();
        getVarDecls().addAll((Collection<? extends VarDeclaration>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EdtlPackage.DECL_VAR_OUTPUT__OUTPUT_COUNTER:
        setOutputCounter(OUTPUT_COUNTER_EDEFAULT);
        return;
      case EdtlPackage.DECL_VAR_OUTPUT__VAR_DECLS:
        getVarDecls().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EdtlPackage.DECL_VAR_OUTPUT__OUTPUT_COUNTER:
        return OUTPUT_COUNTER_EDEFAULT == null ? outputCounter != null : !OUTPUT_COUNTER_EDEFAULT.equals(outputCounter);
      case EdtlPackage.DECL_VAR_OUTPUT__VAR_DECLS:
        return varDecls != null && !varDecls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (outputCounter: ");
    result.append(outputCounter);
    result.append(')');
    return result.toString();
  }

} //DeclVarOutputImpl
