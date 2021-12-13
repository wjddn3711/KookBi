package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dao.UserDAO;
import dto.UserDTO;

public class MyInfoView {
	public MyInfoView() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		ProductDAO pdao = new ProductDAO(); 
		
		UserDTO loginUser = (UserDTO)Session.get("loginUser");
		System.out.printf("======%s���� ȸ������======\n���̵� : %s\n��й�ȣ : %s\n"
				+"�ڵ��� ��ȣ : %s\n�ּ� : %s\n",loginUser.username,loginUser.userid,
				loginUser.userpw,loginUser.userphone,loginUser.useraddr);
		System.out.println("======================");
		System.out.println("1. ��й�ȣ ����\n2. �ڵ�����ȣ ����\n3. �ּ� ����\n4. �������\n5. ȸ��Ż��");
		int choice = sc.nextInt();
		if(choice == 4) {
			System.out.println("�������� ���ư��ϴ�.");
		}else if(choice == 5) {
			//ȸ��Ż��
			System.out.print("��й�ȣ ���Է� : ");
			String userpw = sc.next();
			if(loginUser.userpw.equals(userpw)) {
				if(pdao.removeAll(loginUser.userid)) {
					if(udao.leaveId(loginUser.userid)) {
						System.out.println("�׵��� �̿��� �ּż� �����մϴ�...��");
					}
				}
			}
			else {
				System.out.println("��й�ȣ ���� / ������ �ٽ� �õ����ּ���.");
			}
		}else {
			//��������
			System.out.print("���ο� ���� : ");
			sc = new Scanner(System.in);
			String newData = sc.nextLine();
			boolean check=false;
			switch(choice) {
			case 1:
				//��й�ȣ ����
				check = udao.modifyUser(loginUser.userid,1,newData);
				break;
//			case 2:
//				//�ڵ�����ȣ ����
//				udao.modifyUser(loginUser.userid,4,newData);
//				break;
//			case 3:
//				//�ּ� ����
//				udao.modifyUser(loginUser.userid,5,newData);
//				break;
			case 2: case 3:
				check = udao.modifyUser(loginUser.userid, choice+2, newData);
				break;
			}
			if(check) {
				System.out.println("���� ���� �Ϸ�!");
			}
			else {
				System.out.println("���� ���� ���� / ������ �ٽ� �õ��� �ּ���.");
			}
		}
	}
}










