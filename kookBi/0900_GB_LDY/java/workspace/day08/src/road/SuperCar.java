package road;

import javax.jws.WebService;

public class SuperCar extends Car{
	String pw;
	
//	super : �θ�Ŭ������ �̸�(Car)
//	super() : �θ�Ŭ�����̸�() --> Car()
	public SuperCar() {}
//	Alt + Shift + S > C : �θ� Ŭ������ ������ �״�� �޾ƿͼ� ������ �����
	public SuperCar(int price) {
		super(price);
	}

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
	
	//@ : ������̼�
	@Override
	void engineStop() {
		//�������̵� �ϰ���� �޼ҵ� �̸� �ۼ� �� �ڵ��ϼ�
		System.out.println(brand+" ��ġ�� �õ� ����");
	}
	
	void roofOpen() {
		System.out.println(brand+" �Ѳ� ����");
	}
	void roofClose() {
		System.out.println(brand+" �Ѳ� �ݱ�");
	}
	
}
