package road;

public class SuperCar extends Car{
	String pw;
	
	public SuperCar() {}

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
	
	void engineStop() {
		System.out.println(brand+" 터치로 시동 끄기");
	}
	
	void roofOpen() {
		System.out.println(brand+" 뚜껑 열기");
	}
	void roofClose() {
		System.out.println(brand+" 뚜껑 닫기");
	}
	
}
