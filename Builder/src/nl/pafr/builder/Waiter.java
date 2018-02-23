package nl.pafr.builder;

public class Waiter {
	
	 private AbstractPizzaBuilder pizzaBuilder;

	    public void setPizzaBuilder(AbstractPizzaBuilder pb) {
	        pizzaBuilder = pb;
	    }

	    public Pizza getPizza() {
	        return pizzaBuilder.getPizza();
	    }

	    public void constructPizza() {
	        pizzaBuilder.createNewPizzaProduct();
	        pizzaBuilder.buildDough();
	        pizzaBuilder.buildSauce();
	        pizzaBuilder.buildTopping();
	    } 

}
