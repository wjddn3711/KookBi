package road;

public class Car {
	String brand;
	String color;
	int price;
	static int wheel = 4;
	
	//������ �����ε�
	public Car() {}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	�����ε��� �Ű������� �ڷ������� ���� / �ڷ����� ������ ������ �ٸ��ٸ� ���� ����
	public Car(String brand, int price,String color) {
		
	}
	
	public Car(int price) {
		this.price = price;
	}
	
	static void showWheelCnt() {
		String name = "��ȣ";
		System.out.println(wheel);
		System.out.println(name);
	}

	void engineStart() {
		System.out.println(brand+" ����� �õ� �ѱ�");
	}
	
	void engineStop() {
		System.out.println(brand+" ����� �õ� ����");
	}
}
