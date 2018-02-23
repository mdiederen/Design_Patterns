package nl.pafr.abstract_factory;

public class WindowsVensterFactory implements AbstractVensterFactory{

	@Override
	public Venster createVenster() {
		WindowsVenster venster = new WindowsVenster();
		
		return venster;
	}

}
