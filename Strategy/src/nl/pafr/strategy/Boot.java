package nl.pafr.strategy;

public class Boot extends Vervoersmiddel{

	public Boot() {
		super();
		setKleur("Wit");
		
		rijden = new kanNietRijden();
	}
	
	

}
