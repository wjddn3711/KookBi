package day01;

//Ctrl + N : Newâ(Ŭ����, ��Ű��, .. ��� ����� â)
public class PrintTask {
	public static void main(String[] args) {
		//------ ���� ���� ���� ------
		//�̸� : ����
		//���� : 10��
		//Ű : 170.24cm
		//������ : 66.24kg
		//���� : C		
		//---------- \O/ ----------
//		System.out.println("------ " + "����" + " ���� ���� ------");
//		System.out.println("�̸� : " + "����");
//		System.out.println("���� : " + 10 + "��");
//		System.out.println("Ű : " + 170.24 + "cm");
//		System.out.println("������ : " + 66.24 + "kg");
//		System.out.println("���� : "+'C');
//		System.out.println("---------- \\O/ ----------");
		
		
//		Ctrl + Alt + ��(��) : �Ʒ�(��)������ ���� ����
//		Alt + ��(��) : �Ʒ�(��)������ ���� �̵�
		System.out.printf("------ %s ���� ���� ------\n","����");
		System.out.printf("�̸� : %s\n","����");
		System.out.printf("���� : %d��\n",10);
		System.out.printf("Ű : %.3fcm\n",170.2424687);
		System.out.printf("������ : %.2fkg\n",66.24);
		System.out.printf("���� : %c\n",'C');
		System.out.println("---------- \\O/ ----------");
		
//		10 10 10 10 10 10 10 10 10 10 ...
//		System.out.println(10+" "+10+" "+10);
		
//		%1$d : 1��°�� �Ѱ��ִ� �������� �� �ڸ��� �ٿ���!
		System.out.printf("%1$d %1$d %1$d %1$d %1$d %1$d %1$d",10);
		
//		"Ű : 170.242cm" ��� ���ڿ� �� ��ü�� �ʿ��� ���
		String.format("Ű : %.3fcm\n",170.2424687);
	}
}

















