package day06;

public class MethodTest {
	public static void main(String[] args) {
		
	}
	
	//f(x) = 2x+1
	int f(int x) {
//		x = �ѱ�°�;
		return 2*x+1;
	}
	
	//���̸�("���ټ�")�� 10�� ����ϴ� �޼ҵ�
	void printName() {
		for (int i = 0; i < 10; i++) {
			System.out.println("���ټ�");
		}
		
	}
	
	//���� �ð������� �˷��ִ� �޼ҵ�
//	�ð�Ÿ�� getTime() {
//		return �ð�����;
//	}
	
//	�������� �� ����ϴ� �޼ҵ�
	void printDan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		}
	}
}










