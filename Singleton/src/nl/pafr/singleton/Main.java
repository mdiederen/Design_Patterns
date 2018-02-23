package nl.pafr.singleton;

public class Main {

	public static void main(String[] args) {
		
		//een instantie van singleton, geen nieuw object.
		Singleton s = Singleton.getInstance();
		
		System.out.println("ID1: "+s.generateID());
		System.out.println("ID2: "+s.generateID());
		System.out.println("ID3: "+s.generateID());

	}
}
