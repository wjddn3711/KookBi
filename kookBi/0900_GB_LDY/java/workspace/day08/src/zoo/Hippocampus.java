package zoo;

public class Hippocampus extends Animal{

	public Hippocampus() {
		super();
	}

	public Hippocampus(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void move() {
		System.out.println("������ ���ʰ���");
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("������ ������ ��������");
	}
	
	void shootBubble() {
		System.out.println("�ֵ��̿��� ����� ���");
	}
	
}



