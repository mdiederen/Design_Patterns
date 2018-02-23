package nl.pafr.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Observable{

	private List<Observer> observers = new ArrayList<Observer>();
	private Double temprature;
	private Double humidity;

	public Weather(Double temp, Double hum) {
		this.temprature = temp;
		this.humidity = hum;
	}

	@Override
	public void addObserver(Observer obs) {
		observers.add(obs);
		System.out.println("Observer "+obs+" added.");

	}

	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);
		System.out.println("Observer "+obs+" removed.");


	}

	public Double getTemprature() {
		return temprature;
	}

	public void setTemprature(Double temprature) {
		this.temprature = temprature;
		notifyObservers();
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		for (Observer ob : observers) {
			ob.update(this.temprature, this.humidity);

		}

	}

}
