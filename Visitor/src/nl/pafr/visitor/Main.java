package nl.pafr.visitor;

public class Main {

	public static void main(String[] args) {
		Drank wodka = new Drank(20.0);
		Rookwaar camel = new Rookwaar(6.20);
		Voedsel banaan = new Voedsel(2.0);
		
		Visitor belastingdienst = new BelastingVisitor();
		
		System.out.println(belastingdienst.visit(wodka));
		System.out.println(belastingdienst.visit(camel));
		System.out.println(belastingdienst.visit(banaan));

	}

}
