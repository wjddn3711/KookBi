package view;

import java.util.ArrayList;
import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dto.UserDTO;

public class MainView {
	public MainView() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("------����ȭ��------");
		while(true) {
			UserDTO loginUser = (UserDTO)Session.get("loginUser");
			if(loginUser == null) {
				System.out.println("�α��� �� �̿��ϼ���.");
				break;
			}
			System.out.println("1. ��ǰ�߰�");
			System.out.println("2. ��ǰ����");
			System.out.println("3. ��ǰ����");
			System.out.println("4. �� ��ǰ ����");
			System.out.println("5. ��ǰ�˻�");
			System.out.println("6. �� ���� ����");
			System.out.println("7. �α׾ƿ�");
			int choice = sc.nextInt();
			
			if(choice == 7) {
				System.out.println(loginUser.username+"�� ������ �� ������~");
				Session.set("loginUser", null);
				break;
			}
			String list=null;
			int prodnum=0;
			switch(choice) {
			case 1:
				//��ǰ�߰�
				new AddProductView();
				break;
			case 2:
				//��ǰ����(����, ���, ����)
				list = pdao.getList(loginUser.userid);
				if(list.equals("")) {
					System.out.println("�ø� ��ǰ�� �����ϴ�.");
				}else {
					System.out.print(list);
					new ModifyProductView();
				}
				break;
			case 3:
				//��ǰ����
				list = pdao.getList(loginUser.userid);
				if(list.equals("")) {
					System.out.println("�ø� ��ǰ�� �����ϴ�.");
				}
				else {
					System.out.print(list);
					System.out.print("������ ��ǰ ��ȣ : ");
					prodnum = sc.nextInt();
					
					if(pdao.removeProduct(prodnum)) {
						//��������
						System.out.println("��ǰ ���� ����!");
					}
					else {
						System.out.println("��ǰ ���� ���� / ������ �ٽ� �õ��� �ּ���.");
					}
				}
				break;
			case 4:
				//����ǰ����
				System.out.println("========���� �ø� ��ǰ���========");
				list = pdao.getList(loginUser.userid);
				if(list.equals("")) {
					System.out.println("�ø� ��ǰ�� �����ϴ�.");
				}
				else {
					System.out.print(list);
				}
				System.out.println("============================");
				break;
			case 5:
				//��ǰ�˻�
				System.out.print("�˻�� �Է��ϼ��� : ");
				sc = new Scanner(System.in);
				String keyword = sc.nextLine();
				ArrayList<String> result = pdao.search(keyword);
//				"���찳"�� �˻��� ���
				System.out.println("\""+keyword+"\"�� �˻��� ���");
				if(result.size() == 0) {
					System.out.println("�˻��� ����� �����ϴ�.");
				}
				else {
					for(String line : result) {
						String[] datas = line.split("\t");
						System.out.printf("%s. %s - %s��(�������� : %s��)\n",
								datas[0],datas[1],datas[2],datas[3]);
					}
				}
				System.out.println("============================");
				System.out.print("�ڼ��� �� ��ǰ��ȣ(�����÷��� 0��) : ");
				prodnum = sc.nextInt();
				new ProductInfoView(prodnum);
				break;
			case 6:
				//����������
				new MyInfoView();
				break;
			}
		}
	}
}







