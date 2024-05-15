package su.nsk.iae.edtl.generator;

import org.eclipse.xtext.generator.IGenerator2;
import su.nsk.iae.edtl.edtl.Model;

@SuppressWarnings("all")
public interface IEdtlGenerator extends IGenerator2 {
  void setModel(final Model model);
}
