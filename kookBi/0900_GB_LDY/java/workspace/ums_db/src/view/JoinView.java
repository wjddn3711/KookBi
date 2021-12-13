package view;

import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class JoinView {
	public JoinView() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.println("------ȸ������ ������ �Դϴ�------");
		System.out.print("���̵� : ");
		String userid = sc.next();
		if(udao.checkId(userid)) {
			System.out.print("��й�ȣ : ");
			String userpw = sc.next();
			
			if(userpw.length()>=8) {
				System.out.print("�̸� : ");
				String username = sc.next();
				System.out.print("���� : ");
				int userage = sc.nextInt();
				System.out.print("�ڵ�����ȣ : ");
				String userphone = sc.next();
				System.out.print("�ּ� : ");
				sc = new Scanner(System.in);
				String useraddr = sc.nextLine();
				
				UserDTO newUser = new UserDTO(userid, userpw, username, userage, userphone, useraddr);
				if(udao.join(newUser)) {
					System.out.println("ȸ������ ����!");
				}
				else {
					System.out.println("ȸ������ ���� / ������ �ٽ� �õ����ּ���.");
				}
			}
			else {
				System.out.println("��й�ȣ�� 8�� �̻��̾�� �մϴ�.");
			}
			
		}
		else {
			System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
		}
	}
}







