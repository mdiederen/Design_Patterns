package nl.pafr.proxy;

public class Main {

	public static void main(String[] args) {
		
		PinautomaatData pinautomaatProxy = new PinAutomaatProxy();
		
		System.out.println(pinautomaatProxy.getAutomaatData());
		System.out.println(pinautomaatProxy.getGeldInAutomaat());
		

		

	}

}
