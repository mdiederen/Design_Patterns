package nl.pafr.visitor;

public class Drank implements Visitable{

	private Double prijs;
	
	public Drank(Double prijs) {
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
