package nl.pafr.proxy;

public class Pinautomaat implements PinautomaatData{
	private int geldInMachine = 20000;
	private int automaatID = 1234;
	
	@Override
	public String getAutomaatData() {
		String s = "AutomaatID: " + automaatID;
		return s;
	}

	@Override
	public int getGeldInAutomaat() {
		return geldInMachine;
	}

	public int getGeldInMachine() {
		return geldInMachine;
	}

	public void setGeldInMachine(int geldInMachine) {
		this.geldInMachine = geldInMachine;
	}

	public int getAutomaatID() {
		return automaatID;
	}

	public void setAutomaatID(int automaatID) {
		this.automaatID = automaatID;
	}

}
