package zoo;

public class Hypsipetes extends Animal{

	public Hypsipetes() {}
	public Hypsipetes(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void move() {
		System.out.println("�Ĵ��Ĵ�");
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("���������̤����������������̤Ӥ��̤Ӥ�!");
	}
	
	void debug() {
		System.out.println("�ڵ��� ���� ã��");
	}
	
}
