package nl.pafr.prototype;

public class Main {

	public static void main(String[] args) {
		

		CloneFactory cloneLab = new CloneFactory();
		
		Sheep Dolly = new Sheep();
		Sheep DollyCloned = (Sheep) cloneLab.getClone(Dolly);
		
		Dog Baily = new Dog();
		Dog BailyCloned = (Dog) cloneLab.getClone(Baily);
		
		System.out.println("Orgineel: "+Dolly);
		System.out.println("Clone: "+DollyCloned);
		
		System.out.println("Orgineel: "+Baily);
		System.out.println("Clone: "+BailyCloned);

	}

}
