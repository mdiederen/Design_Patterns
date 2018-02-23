package nl.pafr.observer;

public class Website implements Observer{
	private String name;

	public Website(String nm) {
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
