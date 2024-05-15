/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.generator;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class LowTerm implements UnaryTerm {
  public Term term;

  public LowTerm(final Term term) {
    this.term = term;
  }

  public LowTerm(final LowTerm lowTerm) {
    Term _xifexpression = null;
    if ((lowTerm.term != null)) {
      _xifexpression = lowTerm.term.copy();
    } else {
      _xifexpression = null;
    }
    this.term = _xifexpression;
  }

  @Override
  public LowTerm copy() {
    return new LowTerm(this);
  }

  @Override
  public boolean equals(final Object o) {
    if ((this == o)) {
      return true;
    }
    if (((o == null) || (!Objects.equal(this.getClass(), o.getClass())))) {
      return false;
    }
    LowTerm that = ((LowTerm) o);
    return java.util.Objects.equals(this.term, that.term);
  }

  @Override
  public int hashCode() {
    return 1;
  }
}
