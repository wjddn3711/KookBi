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
		//   ��
		//String		equals() {����}
		
//		������ü
		Test obj1 = new Test(10, 11.11);
		Test obj2 = new Test(10, 11.11);
		
		System.out.println(obj1 == obj2);
//		Object�� equals()�� ���� ��ü�� ���� ����  ��ü�� ���� �ʴ´�.
//		���ο��� �ּҰ��� ���ϱ� �����̴�.
//		������ �ϴٺ��� �ʿ信 ���� ���� ��ü�� ���� ��ü�� �� �� �־�� �ϱ� ������
//		�츮�� ���� Ŭ�������� �����Ǹ� �� �� �־�� �Ѵ�.
		System.out.println(obj1.equals(obj2));
//		System.out.println(obj1.equals("sdfasF"));
		System.out.println(obj1.hashCode() == obj2.hashCode());
	}
}















