package nl.pafr.null_object;

public class Main {

	public static void main(String[] args) {
		
		// hier laten we het object null (comment out rocky.makeSound() om het volgende deel te testen.
		Animal rocky = null;
		
		// rocky.makeSound();
		
		// hier gebruiken we het null object
		rocky = new NullAnimal();
		
		rocky.makeSound();
		
		// hier geven we rocky een hond object
		
		rocky = new Dog();
		
		rocky.makeSound();

	}

}
