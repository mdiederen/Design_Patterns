package nl.pafr.strategy;

public class Main {
	public static void main(String[] args) {
		Vervoersmiddel brum = new Auto();
		Vervoersmiddel titanic = new Boot();
		
		System.out.println("Brum: "+brum.beginTeRijden());
		System.out.println("Titanic: "+titanic.beginTeRijden());

	}

}
