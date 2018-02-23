package nl.pafr.factory;

public class IphoneFabriek extends SmartphoneFabriek{

	@Override
	public Smartphone produceerSmartphone() {
		return new Iphone();
	}

}
