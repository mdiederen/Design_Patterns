package nl.pafr.template_method;

public abstract class AppCompiler {

	public final void Compile() {
		collectSource();
		compileToTarget();
	}

	//Template methods
	protected abstract void collectSource();
	protected abstract void compileToTarget();
}
