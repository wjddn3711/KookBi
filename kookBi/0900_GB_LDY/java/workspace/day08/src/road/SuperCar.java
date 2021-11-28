package road;

import javax.jws.WebService;

public class SuperCar extends Car{
	String pw;
	
//	super : 부모클래스의 이름(Car)
//	super() : 부모클래스이름() --> Car()
	public SuperCar() {}
//	Alt + Shift + S > C : 부모 클래스의 생성자 그대로 받아와서 생성자 만들기
	public SuperCar(int price) {
		super(price);
	}

	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	
//	Alt + Shift + S > O : 필드를 이용해서 생성자 만들기(부모 생성자 선택 가능)
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}

	void engineStart() {
		System.out.println(brand+" 터치로 시동 켜기");
	}
	
	//@ : 어노테이션
	@Override
	void engineStop() {
		//오버라이딩 하고싶은 메소드 이름 작성 후 자동완성
		System.out.println(brand+" 터치로 시동 끄기");
	}
	
	void roofOpen() {
		System.out.println(brand+" 뚜껑 열기");
	}
	void roofClose() {
		System.out.println(brand+" 뚜껑 닫기");
	}
	
}
