package nl.pafr.visitor;

public interface Visitor {
	
	public double visit(Drank drankItem);
	public double visit(Rookwaar rookItem);
	public double visit(Voedsel voedselItem);

}
