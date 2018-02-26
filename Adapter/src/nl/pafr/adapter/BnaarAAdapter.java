package nl.pafr.adapter;

//Adapter
public class BnaarAAdapter implements InterfaceA {
	
	private KlasseB klasseB;
	
	public BnaarAAdapter(KlasseB b) {
		klasseB = b;
	}

	@Override
	public void methodeA() {
		klasseB.methodeB();
		
	}

	public void setKlasseB(KlasseB klasseB) {
		this.klasseB = klasseB;
	}

}
