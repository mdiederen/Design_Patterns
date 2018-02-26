package nl.pafr.template_method;

public class Main {

	public static void main(String[] args) {
		
		AppCompiler iPhoneApp = new IOSCompiler();
		AppCompiler AndroidApp = new AndroidCompiler();
		
		iPhoneApp.Compile();
		AndroidApp.Compile();
		

	}

}
