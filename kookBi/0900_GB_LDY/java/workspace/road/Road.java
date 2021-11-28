package road;

public class Road {
	public static void main(String[] args) {
		Car brokenFerrari = new SuperCar("Ferrari","Red",65000);

//		업캐스팅 객체는 자식에서 추가한 내용은 쓸 수 없다.
//		brokenFerrari.roofOpen();
		
//		오버라이딩 메소드는 자식것으로 사용
		brokenFerrari.engineStart();
		
		((SuperCar)brokenFerrari).roofOpen();
		
//		다운캐스팅은 매번 위의 모습처럼 괄호로 묶어주며 해야하고 가독성이 떨어진다.
//		그래서 보통 다운캐스팅 한 결과를 아예 자식객체에 담아둔다.
		SuperCar fixedFerrari = (SuperCar)brokenFerrari;
		fixedFerrari.roofOpen();
		fixedFerrari.roofOpen();
		fixedFerrari.roofOpen();
		
	}
}






