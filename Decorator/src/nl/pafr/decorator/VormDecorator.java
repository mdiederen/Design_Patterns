package nl.pafr.decorator;

public abstract class VormDecorator implements Vorm {

	protected Vorm vorm;
	
	public VormDecorator(Vorm vorm) {
		super();
		this.vorm = vorm;
	}

	@Override
	public void teken() {
		vorm.teken();
		
	}

}
