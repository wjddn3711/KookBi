package road;

public class SuperCar extends Car{
	String pw;
	
	public SuperCar() {}

	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	
//	Alt + Shift + S > O : �ʵ带 �̿��ؼ� ������ �����(�θ� ������ ���� ����)
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}

	void engineStart() {
		System.out.println(brand+" ��ġ�� �õ� �ѱ�");
	}
	
	void engineStop() {
		System.out.println(brand+" ��ġ�� �õ� ����");
	}
	
	void roofOpen() {
		System.out.println(brand+" �Ѳ� ����");
	}
	void roofClose() {
		System.out.println(brand+" �Ѳ� �ݱ�");
	}
	
}
