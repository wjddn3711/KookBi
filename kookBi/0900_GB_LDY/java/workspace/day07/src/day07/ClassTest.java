package day07;

public class ClassTest {
	public static void main(String[] args) {
//		null : 주소값의 초기값
		
//		Car mycar = new Car();
////		System.out.println(mycar);
//		mycar.brand = "Ferrari";
//		mycar.color = "Red";
//		mycar.price = 65000;
		Car mycar = new Car("Ferrari","Red",65000);
		Car momcar = new Car("K7", "White", 7000);
		
		System.out.println("내 차의 브랜드 : "+mycar.brand);
		System.out.println("내 차의 색상 : "+mycar.color);
		System.out.println("내 차의 가격 : "+mycar.price);
		
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
	
	
	//생성자는 해당 클래스 내부영역에 선언
	Car(String brand, String color, int price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println(this.brand+" 시동 켜기");
	}
	
	void engineStop() {
		//같은 이름의 지역변수가 없다면 this는 생략 가능
		System.out.println(brand+"시동 끄기");
	}
}








