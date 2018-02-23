package nl.pafr.abstract_factory;

public class MacOSVenster implements Venster{
	
	@Override
	public void repaint() {
		// Knoppen aanpassen zodat het meer in de Mac OS omgeving past bijvoorbeeld...
		System.out.println("Nieuw MAC OS -venster aangemaakt.");

	}

}
