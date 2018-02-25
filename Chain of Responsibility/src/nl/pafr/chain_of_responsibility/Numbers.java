package nl.pafr.chain_of_responsibility;

public class Numbers {
	
	private double number1;
	private double number2;
	
	private String calculation;
	
	public Numbers(Double num1, Double num2, String calc) {
		number1 = num1;
		number2 = num2;
		calculation = calc;
	}

	public double getNumber1() {
		return number1;
	}

	public double getNumber2() {
		return number2;
	}

	public String getCalculation() {
		return calculation;
	}

}
