/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.generator;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class TimeTerm implements PrimaryTerm {
  public String interval;

  public TimeTerm(final String interval) {
    this.interval = interval;
  }

  public TimeTerm(final TimeTerm term) {
    this.interval = term.interval;
  }

  @Override
  public TimeTerm copy() {
    return new TimeTerm(this);
  }

  @Override
  public boolean equals(final Object o) {
    if ((this == o)) {
      return true;
    }
    if (((o == null) || (!Objects.equal(this.getClass(), o.getClass())))) {
      return false;
    }
    TimeTerm that = ((TimeTerm) o);
    return java.util.Objects.equals(this.interval, that.interval);
  }

  @Override
  public int hashCode() {
    return 1;
  }
}
