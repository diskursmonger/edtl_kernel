/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.edtl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import su.nsk.iae.edtl.edtl.EdtlPackage;
import su.nsk.iae.edtl.edtl.EquExpression;
import su.nsk.iae.edtl.edtl.EquOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equ Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.EquExpressionImpl#getEquOp <em>Equ Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquExpressionImpl extends CompExpressionImpl implements EquExpression
{
  /**
   * The default value of the '{@link #getEquOp() <em>Equ Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquOp()
   * @generated
   * @ordered
   */
  protected static final EquOperator EQU_OP_EDEFAULT = EquOperator.EQUAL;

  /**
   * The cached value of the '{@link #getEquOp() <em>Equ Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquOp()
   * @generated
   * @ordered
   */
  protected EquOperator equOp = EQU_OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquExpressionImpl()
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
    return EdtlPackage.Literals.EQU_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EquOperator getEquOp()
  {
    return equOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEquOp(EquOperator newEquOp)
  {
    EquOperator oldEquOp = equOp;
    equOp = newEquOp == null ? EQU_OP_EDEFAULT : newEquOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.EQU_EXPRESSION__EQU_OP, oldEquOp, equOp));
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
      case EdtlPackage.EQU_EXPRESSION__EQU_OP:
        return getEquOp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdtlPackage.EQU_EXPRESSION__EQU_OP:
        setEquOp((EquOperator)newValue);
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
      case EdtlPackage.EQU_EXPRESSION__EQU_OP:
        setEquOp(EQU_OP_EDEFAULT);
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
      case EdtlPackage.EQU_EXPRESSION__EQU_OP:
        return equOp != EQU_OP_EDEFAULT;
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
    result.append(" (equOp: ");
    result.append(equOp);
    result.append(')');
    return result.toString();
  }

} //EquExpressionImpl
