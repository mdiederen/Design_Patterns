package nl.pafr.adapter;

public class Main {

	public static void main(String[] args) {
		
		KlasseB kB = new KlasseB();
		
		BnaarAAdapter adapter = new BnaarAAdapter(kB);
		
		DoeIetsMetEenA(adapter);
		
	}
	
	private static void DoeIetsMetEenA(InterfaceA a) {
 		a.methodeA();
 	}

}
