/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.generator;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class NotTerm implements UnaryTerm {
  public Term term;

  public NotTerm(final Term term) {
    this.term = term;
  }

  public NotTerm(final NotTerm notTerm) {
    Term _xifexpression = null;
    if ((notTerm.term != null)) {
      _xifexpression = notTerm.term.copy();
    } else {
      _xifexpression = null;
    }
    this.term = _xifexpression;
  }

  @Override
  public NotTerm copy() {
    return new NotTerm(this);
  }

  @Override
  public boolean equals(final Object o) {
    if ((this == o)) {
      return true;
    }
    if (((o == null) || (!Objects.equal(this.getClass(), o.getClass())))) {
      return false;
    }
    NotTerm that = ((NotTerm) o);
    return java.util.Objects.equals(this.term, that.term);
  }

  @Override
  public int hashCode() {
    return 1;
  }
}