package nl.pafr.prototype;

public class CloneFactory {
	
	public Animal getClone(Animal animalSample) {
		
		return animalSample.makeClone();
		
	}

}
