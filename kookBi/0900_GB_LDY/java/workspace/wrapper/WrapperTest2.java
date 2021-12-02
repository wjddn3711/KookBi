package wrapper;

public class WrapperTest2 {
	public static void main(String[] args) {
//		System.out.println(Integer.toHexString(1711685));
//		Integer obj2 = 1711685;
//		f1(10);
//		f2(10);
		f(10);
		f(222.2222);
		f((Integer)10);
		Object obj = (Integer)10;
		f(obj);
	}
	static void f(int data) {
		System.out.println("int 타입으로 호출한 메소드! "+data);
	}
	static void f(Integer obj) {//Integer obj = 10;
		System.out.println("Integer 타입으로 호출한 메소드! "+obj.intValue());
	}
	//int,Integer 빼고 모든 것, 객체
	static void f(Object obj) {//Object obj = new Integer(10);
		System.out.println("Object 타입으로 호출한 메소드!");
	}
}







