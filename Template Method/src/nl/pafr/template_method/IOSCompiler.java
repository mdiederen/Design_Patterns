package nl.pafr.template_method;

public class IOSCompiler extends AppCompiler {

	@Override
	protected void collectSource() {
		System.out.println("Source collected");
		
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Target Compiled");
		
	}

}
