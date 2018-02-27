package nl.pafr.decorator;

public class Main {
	public static void main(String[] args) {

		Vorm blauweCirkel = new BlauweVormDecorator(new Cirkel());

		blauweCirkel.teken();

		Vorm blauweRechthoek = new BlauweVormDecorator(new Rechthoek());

		blauweRechthoek.teken();
	}
}
