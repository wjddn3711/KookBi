package day03;

import java.util.Scanner;

//Window Key + . : �̸���
public class StrEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg1 = "Hello";
		String msg2 = "";
		System.out.print("�λ� ���ּ��� ~ ");
		msg2 = sc.next();
		
		//"���ڿ�1".equals("���ڿ�2") : "���ڿ�1"�� "���ڿ�2"�� ���� ���ڿ��̸� true / �ƴ϶�� false
		if( msg1.equals(msg2) ) {
			System.out.println("�λ� �޾��༭ �����䢽");
		}else {
			System.out.println("������ �� ���ڽó׿�......");
		}
		
//		switch(msg2) {
//		case "Hello":
//			
//			break;
//		default:
//			
//		}
		
	}
}






