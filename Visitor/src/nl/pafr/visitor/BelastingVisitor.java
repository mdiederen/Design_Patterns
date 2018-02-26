package nl.pafr.visitor;

public class BelastingVisitor implements Visitor {
	
	public BelastingVisitor() {
		
	}

	@Override
	public double visit(Drank drankItem) {
		System.out.println("Drank item: prijs incl. BTW");
		return ((drankItem.getPrijs() * 0.21)+drankItem.getPrijs());
	}

	@Override
	public double visit(Rookwaar rookItem) {
		System.out.println("Rookwaar item: prijs incl. BTW");
		return ((rookItem.getPrijs() * 0.41)+rookItem.getPrijs());
	}

	@Override
	public double visit(Voedsel voedselItem) {
		System.out.println("Voedsel item: prijs incl. BTW");
		return ((voedselItem.getPrijs() * 0.06)+voedselItem.getPrijs());
	}

}
