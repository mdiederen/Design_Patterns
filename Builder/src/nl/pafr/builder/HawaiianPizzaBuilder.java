package nl.pafr.builder;

public class HawaiianPizzaBuilder extends AbstractPizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("karton");
		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("zoet");
		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Ham & Ananas");
		
	}

}
