package day03;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("���� : ");
		num = sc.nextInt();
		
		//�б� ó��
//		if(num > 0) {
//			System.out.println("����Դϴ�.");
//		}else if(num < 0) {
//			System.out.println("�����Դϴ�.");
//		}else {
//			System.out.println("0�Դϴ�.");
//		}
		
		//�ϰ� ó��
		String result = "0�Դϴ�.";
		if(num > 0) {
			result = "����Դϴ�.";
		}else if(num < 0) {
			result = "�����Դϴ�.";
		}
		System.out.println(result);
	}
}









