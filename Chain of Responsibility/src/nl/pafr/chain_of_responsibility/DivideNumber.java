package nl.pafr.chain_of_responsibility;

public class DivideNumber implements Chain{

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalculation() == "div") {
			Double calculation = (request.getNumber1()/request.getNumber2());
			System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + calculation);
		} else {
			
			System.out.println("You can only add, sub, mult & div.");
		}
		
	}

}
