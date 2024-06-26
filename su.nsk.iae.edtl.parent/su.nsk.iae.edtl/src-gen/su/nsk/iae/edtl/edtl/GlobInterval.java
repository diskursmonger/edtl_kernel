/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.edtl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glob Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.GlobInterval#getGlobInterval <em>Glob Interval</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getGlobInterval()
 * @model
 * @generated
 */
public interface GlobInterval extends EObject
{
  /**
   * Returns the value of the '<em><b>Glob Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glob Interval</em>' containment reference.
   * @see #setGlobInterval(TimeLiteral)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getGlobInterval_GlobInterval()
   * @model containment="true"
   * @generated
   */
  TimeLiteral getGlobInterval();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.GlobInterval#getGlobInterval <em>Glob Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Glob Interval</em>' containment reference.
   * @see #getGlobInterval()
   * @generated
   */
  void setGlobInterval(TimeLiteral value);

} // GlobInterval
