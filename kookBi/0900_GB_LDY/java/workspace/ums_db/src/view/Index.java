package view;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		System.out.println("11/16 ����� ���� ������Ʈ UMS - DBȯ��");
		Scanner sc = new Scanner(System.in);
		Thread t = new Thread(new Clock());
		t.start();
		while(true) {
			System.out.println("1. ȸ������\n2. �α���\n3. ������");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//ȸ������
				new JoinView();
			}
			else if(choice == 2) {
				//�α���
				new LoginView();
			}
			else if(choice == 3) {
				//������
				System.out.println("������ �� ������~");
				break;
			}
		}
	}
}






