package obj;

public class ObjectTest {
	public static void main(String[] args) {
		Test obj = new Test(10, 11.11);
		
		//println�� ���谡 ������ ��ÿ��� �츮�� �Ŀ� �����
		//�� �޼ҵ带 �̿��ؼ� ������� �� �� ���� ������
		//println�� Object Ÿ���� �Ű������� ����Ǿ� �ְ�
		//�ƹ��ų� �ϳ� �Ѱܶ� / ��ü �ϳ� �Ѱܶ� ��� ���̴�.
		System.out.println(obj);
		//println�� �ܺο��� � ��ü�� �Ѱ��ְ� �Ǹ�
		//���ο��� �� ��ü.toString()�� ����ؼ� ����Ѵ�.
		//.toString()�� �ٿ��� ����ϰ� �Ǹ� toString()��
		//����� �κ� ��°�� ���ڿ��̹Ƿ� �ܼ��� ���ڿ� ����̴�.
		System.out.println(obj.toString());
		
	}
}








