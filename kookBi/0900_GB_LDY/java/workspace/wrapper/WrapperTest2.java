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
		System.out.println("int Ÿ������ ȣ���� �޼ҵ�! "+data);
	}
	static void f(Integer obj) {//Integer obj = 10;
		System.out.println("Integer Ÿ������ ȣ���� �޼ҵ�! "+obj.intValue());
	}
	//int,Integer ���� ��� ��, ��ü
	static void f(Object obj) {//Object obj = new Integer(10);
		System.out.println("Object Ÿ������ ȣ���� �޼ҵ�!");
	}
}







