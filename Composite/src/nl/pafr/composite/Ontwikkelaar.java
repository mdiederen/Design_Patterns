package nl.pafr.composite;

public class Ontwikkelaar implements Werknemer {
	
	private String naam;
	private double salaris;

	public Ontwikkelaar(String naam, double salaris) {
		super();
		this.naam = naam;
		this.salaris = salaris;
	}

	@Override
	public void add(Werknemer werknemer) {
		
	}

	@Override
	public void remove(Werknemer werknemer) {
		
	}

	@Override
	public Werknemer getChild(int i) {
		return null;
	}

	@Override
	public String getNaam() {
		return naam;
	}

	@Override
	public double getSalaris() {
		return salaris;
	}

	@Override
	public void print() {
		System.out.println("-------------");
		System.out.println("Naam ="+getNaam());
		System.out.println("Salaris ="+getSalaris());
		System.out.println("-------------");
		
	}

}
