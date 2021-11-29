package access2;

//다른 패키지에 있는 클래스는 이용하려면 import가 필요하다.
import access1.AccessTest;

public class AccessMain2 extends AccessTest {
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();
//		System.out.println(obj.data2);

//							(obj.data3)
		System.out.println(obj.getData3());

//		obj.data3 = 300;
		obj.setData3(300);
	}
	void f() {
		AccessTest obj = new AccessTest();
//		System.out.println(obj.data4);
		
//		System.out.println(data1);//(default)
		System.out.println(data4);//protected
	}
}
