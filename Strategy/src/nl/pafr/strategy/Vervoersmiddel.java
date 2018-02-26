package nl.pafr.strategy;

public abstract class Vervoersmiddel {
	private String naam;
	private String kleur;
	private int maxSnelheid;
	
	public Rijdt rijden;
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getKleur() {
		return kleur;
	}
	public void setKleur(String kleur) {
		this.kleur = kleur;
	}
	public int getMaxSnelheid() {
		return maxSnelheid;
	}
	public void setMaxSnelheid(int maxSnelheid) {
		this.maxSnelheid = maxSnelheid;
	}
	
	public String beginTeRijden() {
		return rijden.rij();
	}
	
	public void setRijMogelijkheid(Rijdt rijden) {
		this.rijden = rijden;
	}
}
