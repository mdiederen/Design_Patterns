package nl.pafr.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager implements Werknemer{

	private String naam;
	private double salaris;

	ArrayList<Werknemer> werknemers = new ArrayList<Werknemer>();


	public Manager(String naam, double salaris) {
		super();
		this.naam = naam;
		this.salaris = salaris;
	}

	@Override
	public void add(Werknemer werknemer) {
		werknemers.add(werknemer);

	}

	@Override
	public void remove(Werknemer werknemer) {
		werknemers.remove(werknemer);

	}

	@Override
	public Werknemer getChild(int i) {
		return werknemers.get(i);
	}

	@Override
	public String getNaam() {
		return naam;
	}

	@Override
	public double getSalaris() {
		return salaris;
	}

	@Override
	public void print() {
		System.out.println("-------------");
		System.out.println("Naam ="+getNaam());
		System.out.println("Salaris ="+getSalaris());
		System.out.println("-------------");

		Iterator<Werknemer> werknemerIterator = werknemers.iterator();
		while(werknemerIterator.hasNext()){
			Werknemer w = werknemerIterator.next();
			w.print();
		}

	}

}
