package bms;

import java.util.Scanner;

//View : 사용자가 볼 화면
public class View {
	void joinview() {
		Scanner sc = new Scanner(System.in);
		BankManager bm = new BankManager();
		System.out.println("1. 국민은행\n2. 신한은행\n3. 우리은행");
		int bankChoice = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		String account = bm.join(bankChoice, name, pw);
		
		if(account != null) {
			System.out.println(name+"님 가입을 환영합니다~");
			System.out.println("계좌번호 : "+account);
		}else {
			System.out.println("가입 실패.");
		}
		
		
	}
	void loginview() {
		Scanner sc = new Scanner(System.in);
		BankManager bm = new BankManager();
		System.out.print("계좌번호 : ");
		String account = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		//session : 로그인 성공한 정보를 담는 공간
		Bank session = bm.login(account, pw);
		
		if(session != null) {
			System.out.println("로그인 성공!");
			System.out.println(session.name+"님 어서오세요");
			mainview(session);
		}else {
			System.out.println("로그인 실패!");
		}
	}

	void mainview(Bank session) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 입금하기\n2. 출금하기\n3. 잔액조회\n4. 로그아웃");
			int choice = sc.nextInt();
			
			if(choice == 4) {
				System.out.println("다음에 또 이용해주세요~");
				break;
			}
			int money=0;
			switch(choice) {
			case 1:
				//입금
				System.out.print("입금하실 금액 : ");
				money = sc.nextInt();
				session.deposit(money);
				break;
			case 2:
				//출금
				System.out.print("입금하실 금액 : ");
				money = sc.nextInt();
				session.withdraw(money);
				break;
			case 3:
				//잔액조회
				session.show();
				break;
			}
			
		}
	}
}






