package nl.pafr.prototype;

public class Dog implements Animal{
	
	public Dog() {
		
		System.out.println("Dog is made.");
	}

	@Override
	public Animal makeClone() {	
		System.out.println("Dog is being cloned.");

		Dog dogObject = null;

		try {
			dogObject = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return dogObject;
	}
	
	public String toString() {
		return "Baily is alive!";
	}
}
