package generic;

public class GMethodTest {
	<T>void f(T data) {
		if(data instanceof Integer) {
			System.out.println("������ ȣ��");
		}
		else if(data instanceof Double || data instanceof Float) {
			System.out.println("�Ǽ��� ȣ��");
		}
		else if(data instanceof Character) {
			System.out.println("���ڷ� ȣ��");
		}
		else if(data instanceof String) {
			System.out.println("���ڿ��� ȣ��");
		}
		else if(data instanceof Boolean) {
			System.out.println("�������� ȣ��");
		}
	}
}
