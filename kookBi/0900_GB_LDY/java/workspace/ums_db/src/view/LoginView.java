package view;

import java.util.Scanner;

import dao.UserDAO;

public class LoginView {
	public LoginView() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.print("���̵� : ");
		String userid = sc.next();
		System.out.print("��й�ȣ : ");
		String userpw = sc.next();
		
		if(udao.login(userid,userpw)) {
			System.out.println(userid+"�� �������~");
			new MainView();
		}
		else {
			System.out.println("�α��� ���� / �ٽ� �õ����ּ���.");
		}
	}
}
