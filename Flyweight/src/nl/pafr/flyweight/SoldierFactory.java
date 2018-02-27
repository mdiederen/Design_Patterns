package nl.pafr.flyweight;

//Flyweight Factory
public class SoldierFactory {
	
	private static Soldier SOLDIER;
	
	public static Soldier getSoldier(){

		// this is a singleton 
		// if there is no soldier 
		if(SOLDIER==null){

			// create the soldier 
			SOLDIER = new SoldierImpl();
		}

		// return the only soldier reference
		return SOLDIER;
	}

}
