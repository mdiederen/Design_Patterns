package nl.pafr.abstract_factory;

public class GUIBuilder {
	
	public void buildWindow(AbstractVensterFactory vensterFactory) {
		Venster venster = vensterFactory.createVenster();
		venster.repaint();
	}
}
