package nl.pafr.chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		
		Chain chainCalc1 = new AddNumber();
		Chain chainCalc2 = new SubtractNumber();
		Chain chainCalc3 = new MultNumber();
		Chain chainCalc4 = new DivideNumber();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		Numbers request = new Numbers(1234.0, 4321.0, "mult");
		
		chainCalc1.calculate(request);

	}

}
