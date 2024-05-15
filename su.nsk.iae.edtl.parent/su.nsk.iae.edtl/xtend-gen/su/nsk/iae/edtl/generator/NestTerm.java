/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.generator;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class NestTerm implements PrimaryTerm {
  public Term term;

  public NestTerm(final Term term) {
    this.term = term;
  }

  public NestTerm(final NestTerm nestTerm) {
    Term _xifexpression = null;
    if ((nestTerm.term != null)) {
      _xifexpression = nestTerm.term.copy();
    } else {
      _xifexpression = null;
    }
    this.term = _xifexpression;
  }

  @Override
  public NestTerm copy() {
    return new NestTerm(this);
  }

  @Override
  public boolean equals(final Object o) {
    if ((this == o)) {
      return true;
    }
    if (((o == null) || (!Objects.equal(this.getClass(), o.getClass())))) {
      return false;
    }
    NestTerm that = ((NestTerm) o);
    return java.util.Objects.equals(this.term, that.term);
  }

  @Override
  public int hashCode() {
    return 1;
  }
}
