package generic;

public class GenericMain {
	public static void main(String[] args) {
//		1. 제네릭 클래스
//		GClassTest<String> obj = new GClassTest<String>("겨울 너무 추워");
//		GClassTest<Integer> obj2 = new GClassTest<Integer>(100);
//		
//		System.out.println(obj.data);
//		System.out.println(obj2.data);
		
//		2. 제네릭 메소드
//		GMethodTest obj = new GMethodTest();
//		obj.<String>f("Hello");
//		obj.<Character>f('A');
////		obj.<Double>f(10);
////		제네릭 메소드들은 암묵적으로 타입을 알 수 있는 경우가 대부분이다.
////		꺽쇠괄호를 이용해서 타입을 명시적으로 적지 않아도 된다.
//		obj.f(12.24);
		
//		3. 제네릭 인터페이스
		GInterTest<Integer, Double> obj = new GInterTest<Integer, Double>() {
			
			@Override
			public Double div(Double num1, Double num2) {
				return num1/num2;
			}
			
			@Override
			public Integer add(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		GInterImpl obj2 = new GInterImpl();
	
	}
}











