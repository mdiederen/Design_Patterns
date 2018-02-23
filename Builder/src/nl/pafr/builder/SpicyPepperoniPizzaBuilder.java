package nl.pafr.builder;

public class SpicyPepperoniPizzaBuilder extends AbstractPizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("italiaans");
		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Spicy");
		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Pepperoni, Salami & Pepers");
		
	}

}
