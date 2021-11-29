package cage;

public class Dugong extends Animal implements Mammal{

	@Override
	public void move() {
		System.out.println("느적느적 헤엄치며 돌아다닌다.");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("듀우우우고옹");
	}
	
}
