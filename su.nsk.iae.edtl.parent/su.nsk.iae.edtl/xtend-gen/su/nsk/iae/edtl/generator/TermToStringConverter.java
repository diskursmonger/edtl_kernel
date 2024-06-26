/**
 * generated by Xtext 2.34.0
 */
package su.nsk.iae.edtl.generator;

@SuppressWarnings("all")
public class TermToStringConverter {
  private Term term;

  private long globalTimeIntervalMillis;

  private TimeRepresentation timeRepresentation;

  public TermToStringConverter(final Term term, final String globalTimeInterval, final TimeRepresentation timeRepresentation) {
    this.term = term;
    this.globalTimeIntervalMillis = TimeIntervalParser.parseTimeIntervalToMillis(globalTimeInterval);
    this.timeRepresentation = timeRepresentation;
  }

  public static String convert(final Term term, final String globalTimeInterval, final TimeRepresentation timeRepresentation) {
    return new TermToStringConverter(term, globalTimeInterval, timeRepresentation).convert();
  }

  public String convert() {
    return this.convertTermToString(this.term);
  }

  private String convertTermToString(final Term term) {
    if ((term instanceof AndTerm)) {
      String _convertTermToString = this.convertTermToString(((AndTerm)term).left);
      String _plus = ("(" + _convertTermToString);
      String _plus_1 = (_plus + " ∧ ");
      String _convertTermToString_1 = this.convertTermToString(((AndTerm)term).right);
      String _plus_2 = (_plus_1 + _convertTermToString_1);
      return (_plus_2 + ")");
    }
    if ((term instanceof OrTerm)) {
      String _convertTermToString_2 = this.convertTermToString(((OrTerm)term).left);
      String _plus_3 = ("(" + _convertTermToString_2);
      String _plus_4 = (_plus_3 + " ∨ ");
      String _convertTermToString_3 = this.convertTermToString(((OrTerm)term).right);
      String _plus_5 = (_plus_4 + _convertTermToString_3);
      return (_plus_5 + ")");
    }
    if ((term instanceof ImplTerm)) {
      String _convertTermToString_4 = this.convertTermToString(((ImplTerm)term).left);
      String _plus_6 = ("(" + _convertTermToString_4);
      String _plus_7 = (_plus_6 + " → ");
      String _convertTermToString_5 = this.convertTermToString(((ImplTerm)term).right);
      String _plus_8 = (_plus_7 + _convertTermToString_5);
      return (_plus_8 + ")");
    }
    if ((term instanceof WTerm)) {
      String _convertTermToString_6 = this.convertTermToString(((WTerm)term).term);
      String _plus_9 = ("W(" + _convertTermToString_6);
      return (_plus_9 + ")");
    }
    if ((term instanceof FTerm)) {
      String _convertTermToString_7 = this.convertTermToString(((FTerm)term).term);
      String _plus_10 = ("F(" + _convertTermToString_7);
      return (_plus_10 + ")");
    }
    if ((term instanceof GTerm)) {
      String _convertTermToString_8 = this.convertTermToString(((GTerm)term).term);
      String _plus_11 = ("G(" + _convertTermToString_8);
      return (_plus_11 + ")");
    }
    if ((term instanceof UTerm)) {
      String _convertTermToString_9 = this.convertTermToString(((UTerm)term).left);
      String _plus_12 = ("(" + _convertTermToString_9);
      String _plus_13 = (_plus_12 + " U ");
      String _convertTermToString_10 = this.convertTermToString(((UTerm)term).right);
      String _plus_14 = (_plus_13 + _convertTermToString_10);
      return (_plus_14 + ")");
    }
    if ((term instanceof BoolTerm)) {
      return String.valueOf(((BoolTerm)term).value);
    }
    if ((term instanceof VarTerm)) {
      return ((VarTerm)term).name;
    }
    if ((term instanceof TimeTerm)) {
      String _switchResult = null;
      final TimeRepresentation timeRepresentation = this.timeRepresentation;
      if (timeRepresentation != null) {
        switch (timeRepresentation) {
          case PASSED:
            String _valueOf = String.valueOf(((TimeTerm)term).interval);
            String _plus_15 = ("passed(" + _valueOf);
            _switchResult = (_plus_15 + ")");
            break;
          case INTERVAL:
            _switchResult = this.buildTimeIntervalString(((TimeTerm)term).interval, ((TimeTerm)term).attribute);
            break;
          default:
            throw new IllegalArgumentException("Unsupported time representation type");
        }
      } else {
        throw new IllegalArgumentException("Unsupported time representation type");
      }
      return _switchResult;
    }
    if ((term instanceof NestTerm)) {
      String _convertTermToString_11 = this.convertTermToString(((NestTerm)term).term);
      String _plus_16 = ("(" + _convertTermToString_11);
      return (_plus_16 + ")");
    }
    if ((term instanceof NotTerm)) {
      String _convertTermToString_12 = this.convertTermToString(((NotTerm)term).term);
      return ("¬" + _convertTermToString_12);
    }
    if ((term instanceof FeTerm)) {
      String _convertTermToString_13 = this.convertTermToString(((FeTerm)term).term);
      String _plus_17 = ("FE(" + _convertTermToString_13);
      return (_plus_17 + ")");
    }
    if ((term instanceof ReTerm)) {
      String _convertTermToString_14 = this.convertTermToString(((ReTerm)term).term);
      String _plus_18 = ("RE(" + _convertTermToString_14);
      return (_plus_18 + ")");
    }
    if ((term instanceof HighTerm)) {
      String _convertTermToString_15 = this.convertTermToString(((HighTerm)term).term);
      String _plus_19 = ("HIGH(" + _convertTermToString_15);
      return (_plus_19 + ")");
    }
    if ((term instanceof LowTerm)) {
      String _convertTermToString_16 = this.convertTermToString(((LowTerm)term).term);
      String _plus_20 = ("LOW(" + _convertTermToString_16);
      return (_plus_20 + ")");
    }
    throw new IllegalArgumentException("Unsupported term type");
  }

  private String buildTimeIntervalString(final String timeInterval, final Attribute attribute) {
    long timeIntervalMillis = TimeIntervalParser.parseTimeIntervalToMillis(timeInterval);
    double _ceil = Math.ceil((((double) timeIntervalMillis) / this.globalTimeIntervalMillis));
    long cyclesNumber = ((long) _ceil);
    String _switchResult = null;
    if (attribute != null) {
      switch (attribute) {
        case TRIGGER:
          _switchResult = "Tprog";
          break;
        case INVARIANT:
          _switchResult = "Ttrig";
          break;
        case FINAL:
          _switchResult = "Ttrig";
          break;
        case DELAY:
          _switchResult = "Tfin";
          break;
        case REACTION:
          _switchResult = "Tfin";
          break;
        case RELEASE:
          _switchResult = "Ttrig";
          break;
        default:
          throw new IllegalArgumentException("Unsupported attribute type");
      }
    } else {
      throw new IllegalArgumentException("Unsupported attribute type");
    }
    String timeSymbol = _switchResult;
    return (((("(" + timeSymbol) + " >= ") + Long.valueOf(cyclesNumber)) + ")");
  }
}
