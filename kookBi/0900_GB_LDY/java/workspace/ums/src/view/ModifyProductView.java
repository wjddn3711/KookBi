package view;

import java.util.Scanner;

import dao.ProductDAO;

public class ModifyProductView {
	public ModifyProductView() {
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		System.out.print("������ ��ǰ ��ȣ : ");
		int prodnum = sc.nextInt();
		System.out.println("1. ���ݼ���\n2. ������\n3. �������");
		int choice = sc.nextInt();
		System.out.print("���ο� ���� : ");
		sc = new Scanner(System.in);
		String newData = sc.nextLine();
		
		if(pdao.modifyProduct(prodnum,choice,newData)) {
			System.out.println(prodnum+"�� ��ǰ�� ���������� �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("��ǰ ���� ���� / ������ �ٽ� �õ��� �ּ���.");
		}
	}
}
