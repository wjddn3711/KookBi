package road;

public class Car {
	String brand;
	String color;
	int price;
	static int wheel = 4;
	
	//생성자 오버로딩
	public Car() {}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	오버로딩은 매개변수의 자료형으로 구별 / 자료형의 순서나 개수가 다르다면 선언 가능
	public Car(String brand, int price,String color) {
		
	}
	
	public Car(int price) {
		this.price = price;
	}
	
	static void showWheelCnt() {
		String name = "금호";
		System.out.println(wheel);
		System.out.println(name);
	}

	void engineStart() {
		System.out.println(brand+" 열쇠로 시동 켜기");
	}
	
	void engineStop() {
		System.out.println(brand+" 열쇠로 시동 끄기");
	}
}
