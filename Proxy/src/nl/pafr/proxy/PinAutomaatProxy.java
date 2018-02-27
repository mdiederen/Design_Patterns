package nl.pafr.proxy;

public class PinAutomaatProxy implements PinautomaatData{

	@Override
	public String getAutomaatData() {
		Pinautomaat p = new Pinautomaat();
		return p.getAutomaatData();
	}

	@Override
	public int getGeldInAutomaat() {
		Pinautomaat p = new Pinautomaat();
		return p.getGeldInAutomaat();
	}

}
