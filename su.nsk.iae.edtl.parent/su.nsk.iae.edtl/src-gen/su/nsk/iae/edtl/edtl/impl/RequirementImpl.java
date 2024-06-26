/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.edtl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import su.nsk.iae.edtl.edtl.EdtlPackage;
import su.nsk.iae.edtl.edtl.Expression;
import su.nsk.iae.edtl.edtl.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getTrigExpr <em>Trig Expr</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getNlTrig <em>Nl Trig</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getInvExpr <em>Inv Expr</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getNlInv <em>Nl Inv</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getFinalExpr <em>Final Expr</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getNlFinal <em>Nl Final</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getDelayExpr <em>Delay Expr</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getNlDelay <em>Nl Delay</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getReacExpr <em>Reac Expr</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getNlReac <em>Nl Reac</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getRelExpr <em>Rel Expr</em>}</li>
 *   <li>{@link su.nsk.iae.edtl.edtl.impl.RequirementImpl#getNlRel <em>Nl Rel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTrigExpr() <em>Trig Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigExpr()
   * @generated
   * @ordered
   */
  protected Expression trigExpr;

  /**
   * The default value of the '{@link #getNlTrig() <em>Nl Trig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlTrig()
   * @generated
   * @ordered
   */
  protected static final String NL_TRIG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNlTrig() <em>Nl Trig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlTrig()
   * @generated
   * @ordered
   */
  protected String nlTrig = NL_TRIG_EDEFAULT;

  /**
   * The cached value of the '{@link #getInvExpr() <em>Inv Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvExpr()
   * @generated
   * @ordered
   */
  protected Expression invExpr;

  /**
   * The default value of the '{@link #getNlInv() <em>Nl Inv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlInv()
   * @generated
   * @ordered
   */
  protected static final String NL_INV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNlInv() <em>Nl Inv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlInv()
   * @generated
   * @ordered
   */
  protected String nlInv = NL_INV_EDEFAULT;

  /**
   * The cached value of the '{@link #getFinalExpr() <em>Final Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinalExpr()
   * @generated
   * @ordered
   */
  protected Expression finalExpr;

  /**
   * The default value of the '{@link #getNlFinal() <em>Nl Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlFinal()
   * @generated
   * @ordered
   */
  protected static final String NL_FINAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNlFinal() <em>Nl Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlFinal()
   * @generated
   * @ordered
   */
  protected String nlFinal = NL_FINAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getDelayExpr() <em>Delay Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelayExpr()
   * @generated
   * @ordered
   */
  protected Expression delayExpr;

  /**
   * The default value of the '{@link #getNlDelay() <em>Nl Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlDelay()
   * @generated
   * @ordered
   */
  protected static final String NL_DELAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNlDelay() <em>Nl Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlDelay()
   * @generated
   * @ordered
   */
  protected String nlDelay = NL_DELAY_EDEFAULT;

  /**
   * The cached value of the '{@link #getReacExpr() <em>Reac Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReacExpr()
   * @generated
   * @ordered
   */
  protected Expression reacExpr;

  /**
   * The default value of the '{@link #getNlReac() <em>Nl Reac</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlReac()
   * @generated
   * @ordered
   */
  protected static final String NL_REAC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNlReac() <em>Nl Reac</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlReac()
   * @generated
   * @ordered
   */
  protected String nlReac = NL_REAC_EDEFAULT;

  /**
   * The cached value of the '{@link #getRelExpr() <em>Rel Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelExpr()
   * @generated
   * @ordered
   */
  protected Expression relExpr;

  /**
   * The default value of the '{@link #getNlRel() <em>Nl Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlRel()
   * @generated
   * @ordered
   */
  protected static final String NL_REL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNlRel() <em>Nl Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNlRel()
   * @generated
   * @ordered
   */
  protected String nlRel = NL_REL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequirementImpl()
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
    return EdtlPackage.Literals.REQUIREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getTrigExpr()
  {
    return trigExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrigExpr(Expression newTrigExpr, NotificationChain msgs)
  {
    Expression oldTrigExpr = trigExpr;
    trigExpr = newTrigExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__TRIG_EXPR, oldTrigExpr, newTrigExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTrigExpr(Expression newTrigExpr)
  {
    if (newTrigExpr != trigExpr)
    {
      NotificationChain msgs = null;
      if (trigExpr != null)
        msgs = ((InternalEObject)trigExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__TRIG_EXPR, null, msgs);
      if (newTrigExpr != null)
        msgs = ((InternalEObject)newTrigExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__TRIG_EXPR, null, msgs);
      msgs = basicSetTrigExpr(newTrigExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__TRIG_EXPR, newTrigExpr, newTrigExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNlTrig()
  {
    return nlTrig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNlTrig(String newNlTrig)
  {
    String oldNlTrig = nlTrig;
    nlTrig = newNlTrig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__NL_TRIG, oldNlTrig, nlTrig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getInvExpr()
  {
    return invExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvExpr(Expression newInvExpr, NotificationChain msgs)
  {
    Expression oldInvExpr = invExpr;
    invExpr = newInvExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__INV_EXPR, oldInvExpr, newInvExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInvExpr(Expression newInvExpr)
  {
    if (newInvExpr != invExpr)
    {
      NotificationChain msgs = null;
      if (invExpr != null)
        msgs = ((InternalEObject)invExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__INV_EXPR, null, msgs);
      if (newInvExpr != null)
        msgs = ((InternalEObject)newInvExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__INV_EXPR, null, msgs);
      msgs = basicSetInvExpr(newInvExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__INV_EXPR, newInvExpr, newInvExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNlInv()
  {
    return nlInv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNlInv(String newNlInv)
  {
    String oldNlInv = nlInv;
    nlInv = newNlInv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__NL_INV, oldNlInv, nlInv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getFinalExpr()
  {
    return finalExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinalExpr(Expression newFinalExpr, NotificationChain msgs)
  {
    Expression oldFinalExpr = finalExpr;
    finalExpr = newFinalExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__FINAL_EXPR, oldFinalExpr, newFinalExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinalExpr(Expression newFinalExpr)
  {
    if (newFinalExpr != finalExpr)
    {
      NotificationChain msgs = null;
      if (finalExpr != null)
        msgs = ((InternalEObject)finalExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__FINAL_EXPR, null, msgs);
      if (newFinalExpr != null)
        msgs = ((InternalEObject)newFinalExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__FINAL_EXPR, null, msgs);
      msgs = basicSetFinalExpr(newFinalExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__FINAL_EXPR, newFinalExpr, newFinalExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNlFinal()
  {
    return nlFinal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNlFinal(String newNlFinal)
  {
    String oldNlFinal = nlFinal;
    nlFinal = newNlFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__NL_FINAL, oldNlFinal, nlFinal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getDelayExpr()
  {
    return delayExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelayExpr(Expression newDelayExpr, NotificationChain msgs)
  {
    Expression oldDelayExpr = delayExpr;
    delayExpr = newDelayExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__DELAY_EXPR, oldDelayExpr, newDelayExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDelayExpr(Expression newDelayExpr)
  {
    if (newDelayExpr != delayExpr)
    {
      NotificationChain msgs = null;
      if (delayExpr != null)
        msgs = ((InternalEObject)delayExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__DELAY_EXPR, null, msgs);
      if (newDelayExpr != null)
        msgs = ((InternalEObject)newDelayExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__DELAY_EXPR, null, msgs);
      msgs = basicSetDelayExpr(newDelayExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__DELAY_EXPR, newDelayExpr, newDelayExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNlDelay()
  {
    return nlDelay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNlDelay(String newNlDelay)
  {
    String oldNlDelay = nlDelay;
    nlDelay = newNlDelay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__NL_DELAY, oldNlDelay, nlDelay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getReacExpr()
  {
    return reacExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReacExpr(Expression newReacExpr, NotificationChain msgs)
  {
    Expression oldReacExpr = reacExpr;
    reacExpr = newReacExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__REAC_EXPR, oldReacExpr, newReacExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReacExpr(Expression newReacExpr)
  {
    if (newReacExpr != reacExpr)
    {
      NotificationChain msgs = null;
      if (reacExpr != null)
        msgs = ((InternalEObject)reacExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__REAC_EXPR, null, msgs);
      if (newReacExpr != null)
        msgs = ((InternalEObject)newReacExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__REAC_EXPR, null, msgs);
      msgs = basicSetReacExpr(newReacExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__REAC_EXPR, newReacExpr, newReacExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNlReac()
  {
    return nlReac;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNlReac(String newNlReac)
  {
    String oldNlReac = nlReac;
    nlReac = newNlReac;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__NL_REAC, oldNlReac, nlReac));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getRelExpr()
  {
    return relExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelExpr(Expression newRelExpr, NotificationChain msgs)
  {
    Expression oldRelExpr = relExpr;
    relExpr = newRelExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__REL_EXPR, oldRelExpr, newRelExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRelExpr(Expression newRelExpr)
  {
    if (newRelExpr != relExpr)
    {
      NotificationChain msgs = null;
      if (relExpr != null)
        msgs = ((InternalEObject)relExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__REL_EXPR, null, msgs);
      if (newRelExpr != null)
        msgs = ((InternalEObject)newRelExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdtlPackage.REQUIREMENT__REL_EXPR, null, msgs);
      msgs = basicSetRelExpr(newRelExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__REL_EXPR, newRelExpr, newRelExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNlRel()
  {
    return nlRel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNlRel(String newNlRel)
  {
    String oldNlRel = nlRel;
    nlRel = newNlRel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdtlPackage.REQUIREMENT__NL_REL, oldNlRel, nlRel));
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
      case EdtlPackage.REQUIREMENT__TRIG_EXPR:
        return basicSetTrigExpr(null, msgs);
      case EdtlPackage.REQUIREMENT__INV_EXPR:
        return basicSetInvExpr(null, msgs);
      case EdtlPackage.REQUIREMENT__FINAL_EXPR:
        return basicSetFinalExpr(null, msgs);
      case EdtlPackage.REQUIREMENT__DELAY_EXPR:
        return basicSetDelayExpr(null, msgs);
      case EdtlPackage.REQUIREMENT__REAC_EXPR:
        return basicSetReacExpr(null, msgs);
      case EdtlPackage.REQUIREMENT__REL_EXPR:
        return basicSetRelExpr(null, msgs);
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
      case EdtlPackage.REQUIREMENT__NAME:
        return getName();
      case EdtlPackage.REQUIREMENT__TRIG_EXPR:
        return getTrigExpr();
      case EdtlPackage.REQUIREMENT__NL_TRIG:
        return getNlTrig();
      case EdtlPackage.REQUIREMENT__INV_EXPR:
        return getInvExpr();
      case EdtlPackage.REQUIREMENT__NL_INV:
        return getNlInv();
      case EdtlPackage.REQUIREMENT__FINAL_EXPR:
        return getFinalExpr();
      case EdtlPackage.REQUIREMENT__NL_FINAL:
        return getNlFinal();
      case EdtlPackage.REQUIREMENT__DELAY_EXPR:
        return getDelayExpr();
      case EdtlPackage.REQUIREMENT__NL_DELAY:
        return getNlDelay();
      case EdtlPackage.REQUIREMENT__REAC_EXPR:
        return getReacExpr();
      case EdtlPackage.REQUIREMENT__NL_REAC:
        return getNlReac();
      case EdtlPackage.REQUIREMENT__REL_EXPR:
        return getRelExpr();
      case EdtlPackage.REQUIREMENT__NL_REL:
        return getNlRel();
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
      case EdtlPackage.REQUIREMENT__NAME:
        setName((String)newValue);
        return;
      case EdtlPackage.REQUIREMENT__TRIG_EXPR:
        setTrigExpr((Expression)newValue);
        return;
      case EdtlPackage.REQUIREMENT__NL_TRIG:
        setNlTrig((String)newValue);
        return;
      case EdtlPackage.REQUIREMENT__INV_EXPR:
        setInvExpr((Expression)newValue);
        return;
      case EdtlPackage.REQUIREMENT__NL_INV:
        setNlInv((String)newValue);
        return;
      case EdtlPackage.REQUIREMENT__FINAL_EXPR:
        setFinalExpr((Expression)newValue);
        return;
      case EdtlPackage.REQUIREMENT__NL_FINAL:
        setNlFinal((String)newValue);
        return;
      case EdtlPackage.REQUIREMENT__DELAY_EXPR:
        setDelayExpr((Expression)newValue);
        return;
      case EdtlPackage.REQUIREMENT__NL_DELAY:
        setNlDelay((String)newValue);
        return;
      case EdtlPackage.REQUIREMENT__REAC_EXPR:
        setReacExpr((Expression)newValue);
        return;
      case EdtlPackage.REQUIREMENT__NL_REAC:
        setNlReac((String)newValue);
        return;
      case EdtlPackage.REQUIREMENT__REL_EXPR:
        setRelExpr((Expression)newValue);
        return;
      case EdtlPackage.REQUIREMENT__NL_REL:
        setNlRel((String)newValue);
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
      case EdtlPackage.REQUIREMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EdtlPackage.REQUIREMENT__TRIG_EXPR:
        setTrigExpr((Expression)null);
        return;
      case EdtlPackage.REQUIREMENT__NL_TRIG:
        setNlTrig(NL_TRIG_EDEFAULT);
        return;
      case EdtlPackage.REQUIREMENT__INV_EXPR:
        setInvExpr((Expression)null);
        return;
      case EdtlPackage.REQUIREMENT__NL_INV:
        setNlInv(NL_INV_EDEFAULT);
        return;
      case EdtlPackage.REQUIREMENT__FINAL_EXPR:
        setFinalExpr((Expression)null);
        return;
      case EdtlPackage.REQUIREMENT__NL_FINAL:
        setNlFinal(NL_FINAL_EDEFAULT);
        return;
      case EdtlPackage.REQUIREMENT__DELAY_EXPR:
        setDelayExpr((Expression)null);
        return;
      case EdtlPackage.REQUIREMENT__NL_DELAY:
        setNlDelay(NL_DELAY_EDEFAULT);
        return;
      case EdtlPackage.REQUIREMENT__REAC_EXPR:
        setReacExpr((Expression)null);
        return;
      case EdtlPackage.REQUIREMENT__NL_REAC:
        setNlReac(NL_REAC_EDEFAULT);
        return;
      case EdtlPackage.REQUIREMENT__REL_EXPR:
        setRelExpr((Expression)null);
        return;
      case EdtlPackage.REQUIREMENT__NL_REL:
        setNlRel(NL_REL_EDEFAULT);
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
      case EdtlPackage.REQUIREMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EdtlPackage.REQUIREMENT__TRIG_EXPR:
        return trigExpr != null;
      case EdtlPackage.REQUIREMENT__NL_TRIG:
        return NL_TRIG_EDEFAULT == null ? nlTrig != null : !NL_TRIG_EDEFAULT.equals(nlTrig);
      case EdtlPackage.REQUIREMENT__INV_EXPR:
        return invExpr != null;
      case EdtlPackage.REQUIREMENT__NL_INV:
        return NL_INV_EDEFAULT == null ? nlInv != null : !NL_INV_EDEFAULT.equals(nlInv);
      case EdtlPackage.REQUIREMENT__FINAL_EXPR:
        return finalExpr != null;
      case EdtlPackage.REQUIREMENT__NL_FINAL:
        return NL_FINAL_EDEFAULT == null ? nlFinal != null : !NL_FINAL_EDEFAULT.equals(nlFinal);
      case EdtlPackage.REQUIREMENT__DELAY_EXPR:
        return delayExpr != null;
      case EdtlPackage.REQUIREMENT__NL_DELAY:
        return NL_DELAY_EDEFAULT == null ? nlDelay != null : !NL_DELAY_EDEFAULT.equals(nlDelay);
      case EdtlPackage.REQUIREMENT__REAC_EXPR:
        return reacExpr != null;
      case EdtlPackage.REQUIREMENT__NL_REAC:
        return NL_REAC_EDEFAULT == null ? nlReac != null : !NL_REAC_EDEFAULT.equals(nlReac);
      case EdtlPackage.REQUIREMENT__REL_EXPR:
        return relExpr != null;
      case EdtlPackage.REQUIREMENT__NL_REL:
        return NL_REL_EDEFAULT == null ? nlRel != null : !NL_REL_EDEFAULT.equals(nlRel);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", nlTrig: ");
    result.append(nlTrig);
    result.append(", nlInv: ");
    result.append(nlInv);
    result.append(", nlFinal: ");
    result.append(nlFinal);
    result.append(", nlDelay: ");
    result.append(nlDelay);
    result.append(", nlReac: ");
    result.append(nlReac);
    result.append(", nlRel: ");
    result.append(nlRel);
    result.append(')');
    return result.toString();
  }

} //RequirementImpl
