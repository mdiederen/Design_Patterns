package nl.pafr.strategy;

public class Auto extends Vervoersmiddel{

	public Auto() {
		super();
		setKleur("Rood");
		
		rijden = new kanRijden();
		
		
	}

	

}
