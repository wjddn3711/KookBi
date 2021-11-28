package bms;

import java.util.Scanner;

//View : ����ڰ� �� ȭ��
public class View {
	void joinview() {
		Scanner sc = new Scanner(System.in);
		BankManager bm = new BankManager();
		System.out.println("1. ��������\n2. ��������\n3. �츮����");
		int bankChoice = sc.nextInt();
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		
		String account = bm.join(bankChoice, name, pw);
		
		if(account != null) {
			System.out.println(name+"�� ������ ȯ���մϴ�~");
			System.out.println("���¹�ȣ : "+account);
		}else {
			System.out.println("���� ����.");
		}
		
		
	}
	void loginview() {
		Scanner sc = new Scanner(System.in);
		BankManager bm = new BankManager();
		System.out.print("���¹�ȣ : ");
		String account = sc.next();
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		
		//session : �α��� ������ ������ ��� ����
		Bank session = bm.login(account, pw);
		
		if(session != null) {
			System.out.println("�α��� ����!");
			System.out.println(session.name+"�� �������");
			mainview(session);
		}else {
			System.out.println("�α��� ����!");
		}
	}

	void mainview(Bank session) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. �Ա��ϱ�\n2. ����ϱ�\n3. �ܾ���ȸ\n4. �α׾ƿ�");
			int choice = sc.nextInt();
			
			if(choice == 4) {
				System.out.println("������ �� �̿����ּ���~");
				break;
			}
			int money=0;
			switch(choice) {
			case 1:
				//�Ա�
				System.out.print("�Ա��Ͻ� �ݾ� : ");
				money = sc.nextInt();
				session.deposit(money);
				break;
			case 2:
				//���
				System.out.print("�Ա��Ͻ� �ݾ� : ");
				money = sc.nextInt();
				session.withdraw(money);
				break;
			case 3:
				//�ܾ���ȸ
				session.show();
				break;
			}
			
		}
	}
}






