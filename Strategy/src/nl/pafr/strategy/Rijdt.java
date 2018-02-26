package nl.pafr.strategy;

public interface Rijdt {

	String rij();
}

class kanRijden implements Rijdt {

	@Override
	public String rij() {
		return "vroom, vroom..";
		
	}
	
}

class kanNietRijden implements Rijdt {

	@Override
	public String rij() {
		return "Ik kan niet rijden..";
		
	}
	
}
