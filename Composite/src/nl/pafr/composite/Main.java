package nl.pafr.composite;

public class Main {
	public static void main(String[] args) {
		Werknemer emp1= new Ontwikkelaar("John", 10000);
		Werknemer emp2= new Ontwikkelaar("David", 15000);
		Werknemer manager1= new Manager("Daniel",25000);
		
		manager1.add(emp1);
		manager1.add(emp2);
		
		Werknemer emp3= new Ontwikkelaar("Michiel", 20000);
		Manager generalManager= new Manager("Mark", 50000);
		
		generalManager.add(emp3);
		generalManager.add(manager1);
		generalManager.print();
	}
}
