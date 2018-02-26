package nl.pafr.visitor;

public class Rookwaar implements Visitable {
	
private Double prijs;
	
	public Rookwaar(Double prijs) {
		super();
		this.prijs = prijs;
	}
	
	public Double getPrijs() {
		return prijs;
	}
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
