package road;

public class Car {
	String brand;
	String color;
	int price;
	
	public Car() {}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println(brand+" ����� �õ� �ѱ�");
	}
	
	void engineStop() {
		System.out.println(brand+" ����� �õ� ����");
	}
}
