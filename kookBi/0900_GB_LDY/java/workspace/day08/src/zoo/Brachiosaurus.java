package zoo;

public class Brachiosaurus extends Animal{
	
	public Brachiosaurus() {}
	
	public Brachiosaurus(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	void move() {
		System.out.println("��������");
	}
	void makeSomeNoise() {
		System.out.println("�������ĤĤĤĤ�");
	}
	void spinNeck() {
		System.out.println("�� ���� �������� �ֵθ���");
	}
}
