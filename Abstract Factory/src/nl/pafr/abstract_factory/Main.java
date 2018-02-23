package nl.pafr.abstract_factory;

public class Main {

	public static String platform = "MACOS";

	public static void main(String[] args) {

		GUIBuilder builder = new GUIBuilder();
		AbstractVensterFactory vensterFactory = null;

		if(platform == "MACOS"){
			vensterFactory  = new MacOSVensterFactory();
		} else {
			vensterFactory  = new WindowsVensterFactory();
		}
		builder.buildWindow(vensterFactory);
		
	}

}
