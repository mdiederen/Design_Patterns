package nl.pafr.visitor;

public class Voedsel implements Visitable{
	private Double prijs;

	public Voedsel(Double prijs) {
		super();
		this.prijs = prijs;
	}

	public Double getPrijs() {
		return prijs;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
