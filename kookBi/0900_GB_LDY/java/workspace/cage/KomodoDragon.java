package cage;

//파충류
public class KomodoDragon extends Animal implements Reptile{

	@Override
	public void move() {
		System.out.println("혀를 낼름낼름 하면서 돌아다닌다.");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("투명드래곤은 드래곤중에서 최강이엇다");
	}
	
}
