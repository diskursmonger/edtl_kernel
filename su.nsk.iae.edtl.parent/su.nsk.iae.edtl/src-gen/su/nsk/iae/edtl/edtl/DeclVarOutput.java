/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.edtl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decl Var Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.DeclVarOutput#getOutputCounter <em>Output Counter</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.DeclVarOutput#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.edtl.edtl.EdtlPackage#getDeclVarOutput()
 * @model
 * @generated
 */
public interface DeclVarOutput extends EObject
{
  /**
   * Returns the value of the '<em><b>Output Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Counter</em>' attribute.
   * @see #setOutputCounter(String)
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getDeclVarOutput_OutputCounter()
   * @model
   * @generated
   */
  String getOutputCounter();

  /**
   * Sets the value of the '{@link su.nsk.iae.edtl.edtl.DeclVarOutput#getOutputCounter <em>Output Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Counter</em>' attribute.
   * @see #getOutputCounter()
   * @generated
   */
  void setOutputCounter(String value);

  /**
   * Returns the value of the '<em><b>Var Decls</b></em>' containment reference list.
   * The list contents are of type {@link su.nsk.iae.edtl.edtl.VarDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decls</em>' containment reference list.
   * @see su.nsk.iae.edtl.edtl.EdtlPackage#getDeclVarOutput_VarDecls()
   * @model containment="true"
   * @generated
   */
  EList<VarDeclaration> getVarDecls();

} // DeclVarOutput