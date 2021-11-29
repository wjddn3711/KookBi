package cage;

public class Gorilla extends Animal implements Mammal{

	@Override
	public void move() {
		System.out.println("엠파이어 스테이트 빌딩을 올라간다.");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("윈스턴, 보고합니다!");
	}
	
}
