package day03;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		//����ڿ��� ���� 3�� �Է¹޾Ƽ� ¦���鸸 ���
		//�Է�					���
		//10					10
		//3						6
		//6
		
		//�Է�
		//	���� 3�� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//ó��
		//	������ �Է¹��� ������ ¦������ �Ǵ�
		//		¦�����? ���
		//		�ƴ϶��? �Ѿ��
		if(num1%2 == 0) {
			System.out.println(num1);
		}
		if(num2%2 == 0) {
			System.out.println(num2);
		}
		if(num3%2 == 0) {
			System.out.println(num3);
		}
		
		//���
		//	X
		
			
		//����ڿ��� ��������, ��������, �������� �Է¹޾Ƽ� ���� ���
		//�Է�					���
		//�������� : 100			���� : 270��
		//�������� : 90
		//�������� : 80 
		
		//�Է�
		//	��������
		//	��������
		//	�������� �Է¹ޱ�
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		//ó��
		//	������ �Է¹��� ������ ���ϱ�
		int score = 0;
		score += kor;	//score = score+kor;
		score += math;	//score = score+kor+math;
		score += eng;	//score = 0+kor+math+eng;
		
		//���
		//	������ ������ ���� ���
		System.out.println("���� : "+score+"��");
		
	}
}












