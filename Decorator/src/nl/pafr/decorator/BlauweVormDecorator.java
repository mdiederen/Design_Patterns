package nl.pafr.decorator;

public class BlauweVormDecorator extends VormDecorator{

	public BlauweVormDecorator(Vorm vorm) {
		super(vorm);
	}

	@Override
	public void teken() {
		vorm.teken();
		setBlauweKleur(vorm);

	}

	private void setBlauweKleur(Vorm vorm){
		System.out.println("Vormkleur: blauw");
	}
}
