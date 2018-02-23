package nl.pafr.observer;

public class Main {

	public static void main(String[] args) {
		Weather weather = new Weather(28.7, 50.0);
		Observer screen = new Screen("Screen");
		Observer website = new Website("Website");
		
		weather.addObserver(screen);
		weather.addObserver(website);
		
		weather.setTemprature(30.0);
		
		weather.removeObserver(screen);
		
		weather.setHumidity(80.0);


	}
}
