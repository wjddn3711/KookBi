package day07;

public class StorageTest {
	//�������� - �Ķ���
	int data=10;			//�Ű������� ���������� ����
	//�������� - ��¦ ������
	static int s_data = 200;
	public static void main(String[] args) {
		StorageTest s = new StorageTest();
		s.f1();
		s.f2();
//		���� �޼ҵ�(static �޼ҵ�)������ �Ϲ� ���������� ����� �� ����
//		data = 3000;
		System.out.println(s_data);
	}
	void f1() {
		//�������� - ����
		int f1_data = 100;
		System.out.println(data);
		System.out.println(f1_data);
		System.out.println(s_data);
	}
	void f2() {
		System.out.println(data);
//		���������� �ش� ���������� ���� ����
//		System.out.println(f1_data);
	}
}
