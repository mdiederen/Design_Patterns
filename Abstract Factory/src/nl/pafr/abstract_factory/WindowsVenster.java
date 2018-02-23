package nl.pafr.abstract_factory;

public class WindowsVenster implements Venster{
	
	@Override
	public void repaint() {
		// Knoppen aanpassen zodat het meer in de Windows omgeving past...
		System.out.println("Nieuw Windows-venster aangemaakt.");

	}

}
