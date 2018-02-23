package nl.pafr.prototype;

public class Sheep implements Animal {

	public Sheep() {
		
		System.out.println("Sheep is made.");
	}
	
	@Override
	public Animal makeClone() {
		System.out.println("Sheep is being cloned.");
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
				
		return sheepObject;
	}
	
	public String toString() {
		return "Dolly is alive!";
	}

}
