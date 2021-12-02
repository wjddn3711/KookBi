package obj;

public class StrTest {
	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = "Hello";
		
		String msg3 = new String("Hello");
		String msg4 = new String("Hello");
		
//		System.out.println(msg1 == msg2);
//		System.out.println(msg1 == msg3);
//		System.out.println(msg3 == msg4);
//		System.out.println(msg3.equals(msg4));
		//Object		equals() {  return this == obj }
		//   ↓
		//String		equals() {값비교}
		
//		동위객체
		Test obj1 = new Test(10, 11.11);
		Test obj2 = new Test(10, 11.11);
		
		System.out.println(obj1 == obj2);
//		Object의 equals()는 동위 객체를 절대 동일  객체로 보지 않는다.
//		내부에서 주소값을 비교하기 때문이다.
//		개발을 하다보면 필요에 의해 동위 객체를 동일 객체로 볼 수 있어야 하기 때문에
//		우리가 만든 클래스에서 재정의를 할 수 있어야 한다.
		System.out.println(obj1.equals(obj2));
//		System.out.println(obj1.equals("sdfasF"));
		System.out.println(obj1.hashCode() == obj2.hashCode());
	}
}















