/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.generator;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class OrTerm implements Term {
  public Term left;

  public Term right;

  public OrTerm(final Term l, final Term r) {
    this.left = l;
    this.right = r;
  }

  public OrTerm(final OrTerm term) {
    Term _xifexpression = null;
    if ((term.left != null)) {
      _xifexpression = term.left.copy();
    } else {
      _xifexpression = null;
    }
    this.left = _xifexpression;
    Term _xifexpression_1 = null;
    if ((term.right != null)) {
      _xifexpression_1 = term.right.copy();
    } else {
      _xifexpression_1 = null;
    }
    this.right = _xifexpression_1;
  }

  @Override
  public Term copy() {
    return new OrTerm(this);
  }

  @Override
  public boolean equals(final Object o) {
    if ((this == o)) {
      return true;
    }
    if (((o == null) || (!Objects.equal(this.getClass(), o.getClass())))) {
      return false;
    }
    OrTerm that = ((OrTerm) o);
    return (java.util.Objects.equals(this.left, that.left) && java.util.Objects.equals(this.right, that.right));
  }

  @Override
  public int hashCode() {
    return 1;
  }
}