package cage;

public class Gorilla extends Animal implements Mammal{

	@Override
	public void move() {
		System.out.println("�����̾� ������Ʈ ������ �ö󰣴�.");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("������, �����մϴ�!");
	}
	
}
