package nl.pafr.template_method;

public class AndroidCompiler extends AppCompiler {

	@Override
	protected void collectSource() {
		System.out.println("Source collected");
		
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Target Compiled");
		
	}

}
