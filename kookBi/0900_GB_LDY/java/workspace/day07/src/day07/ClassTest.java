package day07;

public class ClassTest {
	public static void main(String[] args) {
//		null : �ּҰ��� �ʱⰪ
		
//		Car mycar = new Car();
////		System.out.println(mycar);
//		mycar.brand = "Ferrari";
//		mycar.color = "Red";
//		mycar.price = 65000;
		Car mycar = new Car("Ferrari","Red",65000);
		Car momcar = new Car("K7", "White", 7000);
		
		System.out.println("�� ���� �귣�� : "+mycar.brand);
		System.out.println("�� ���� ���� : "+mycar.color);
		System.out.println("�� ���� ���� : "+mycar.price);
		
		mycar.engineStart();
		momcar.engineStart();
//		Car momcar = new Car();
//		Car car = null;
//		car.engineStart();
//		System.out.println(car);
	}
}

class Car{
	String brand;
	String color;
	int price;
	
	
	//�����ڴ� �ش� Ŭ���� ���ο����� ����
	Car(String brand, String color, int price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println(this.brand+" �õ� �ѱ�");
	}
	
	void engineStop() {
		//���� �̸��� ���������� ���ٸ� this�� ���� ����
		System.out.println(brand+"�õ� ����");
	}
}








