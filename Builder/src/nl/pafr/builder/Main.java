package nl.pafr.builder;

public class Main {

	public static void main(String[] args) {
		
		Waiter waiter = new Waiter();
		
        AbstractPizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        AbstractPizzaBuilder spicyPizzaBuilder = new SpicyPepperoniPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.constructPizza();
        
        Pizza pizza = waiter.getPizza();
        
        System.out.println("Hawaiian Pizza: \nDough: "+pizza.getDough()+" Sauce: "+pizza.getSauce()+" Toppings: "+pizza.getTopping());
        
        waiter.setPizzaBuilder( spicyPizzaBuilder );
        waiter.constructPizza();
        
        pizza = waiter.getPizza();
        
        System.out.println("Spicy Pizza: \nDough: "+pizza.getDough()+" Sauce: "+pizza.getSauce()+" Toppings: "+pizza.getTopping());


	}

}
