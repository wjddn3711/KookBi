package bms;

import java.util.Scanner;

//Index : ó������ ���۵Ǵ� ��
public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		View v = new View();
		System.out.println("BMS ���α׷� �Դϴ�.");
		while(true) {
			System.out.println("1. ���°���\n2. �α���\n3. ������");
			int choice = sc.nextInt();
			if(choice == 3) {
				System.out.println("�ȳ���������.");
				break;
			}
			switch(choice) {
			case 1:
				//���°���
				v.joinview();
				break;
			case 2:
				//�α���
				v.loginview();
				break;
			}
		}
	}
	
}



