package day06;

//Ctrl + Ŭ�� : ����� ������ �̵�
public class StrTest {
	public static void main(String[] args) {
		String msg = "Hello Java!";
		
//		"���ڿ�1".split("���ڿ�2") : "���ڿ�1" �� "���ڿ�2" �������� ������(String[] ��ȯ)
		String[] arr1 = msg.split(" "); //{"Hello","Java!"}
		System.out.println("���� �պκ� : "+arr1[0]);
		System.out.println("���� �޺κ� : "+arr1[1]);
		String[] arr2 = msg.split("u");//split�� ������ ���Ѵٸ� ��ü ���ڿ� �Ѱ��� ����ִ� String[] ��ȯ
		System.out.println(arr2[0]);
		
//		"���ڿ�".charAt(n) : "���ڿ�"�� n��° ����(char ��ȯ)
		char ch = msg.charAt(0);//'H'	char ch = 'H';
		System.out.println("0��° ���� : "+ch);
		
//		"���ڿ�1".indexOf("���ڿ�2") : "���ڿ�1"���� "���ڿ�2"�� �����ϴ� �ε���(int ��ȯ)
		int idx = msg.indexOf("J");//6	int idx = 6;
		System.out.println("J�� �ε��� : "+idx);
		idx = msg.indexOf("Java");
		System.out.println("Java�� �ε��� : "+idx);
		idx = msg.indexOf("t");
		System.out.println("t�� �ε��� : "+idx);
		
//		"���ڿ�1".equals("���ڿ�2") : "���ڿ�1"�� "���ڿ�2"�� ������ ��(boolean ��ȯ)
		System.out.println(msg.equals("Bye Java!"));
		
//		"���ڿ�".length() : "���ڿ�"�� ����(int ��ȯ)
		int len = msg.length();//11		int len = 11;
		System.out.println("���ڿ��� ���� : "+len);
		
//		"���ڿ�1".replace("���ڿ�2","���ڿ�3") : "���ڿ�1" ���� "���ڿ�2" �� ã�� "���ڿ�3"���� ��ȯ(String ��ȯ)
//											����("���ڿ�1")�� �״��
		String newMsg = msg.replace("Hello", "Bye"); //"Bye Java!"
		System.out.println("���� : "+msg);
		System.out.println("�ٲ� �� : "+newMsg);
		
//		"���ڿ�".substring(n) : "���ڿ�" �� n���� ������ �߶� �����ֱ�(String ��ȯ)
		String subMsg1 = msg.substring(6);//"Java!"
		System.out.println("6��°���� ������ : "+subMsg1);
		
//		"���ڿ�".substring(n,m) : "���ڿ�" �� n���� m �������� �߶� �����ֱ�(String ��ȯ)
		String subMsg2 = msg.substring(6,8);//"Ja"
		System.out.println("6��°���� 8 �������� : "+subMsg2);
		
//		"���ڿ�".trim() : "���ڿ�" �� ���� �ִ� ������� ����(String ��ȯ)
		System.out.println("                        Java                                ".trim());
		
//		���� ������ �ٲٱ�
		msg = msg.replace("Hello", "Bye");
		System.out.println(msg);
		
	}
}















