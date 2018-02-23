package nl.pafr.observer;

public class Screen implements Observer{
	private String name;
	
	public Screen(String nm) {
		name = nm;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Double temprature, Double humidity) {
		System.out.println(name+": The temprature is: "+temprature+" the humidity is: "+humidity);
		
	}

}
