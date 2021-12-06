package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dto.ProductDTO;
import dto.UserDTO;

public class AddProductView {
	public AddProductView() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ �̸� : ");
		String prodname = sc.next();
		System.out.print("��ǰ ���� : ");
		int prodprice = sc.nextInt();
		System.out.print("��ǰ ��� : ");
		int prodamount = sc.nextInt();
		System.out.print("��ǰ �Ұ� : ");
		sc = new Scanner(System.in);
		String prodinfo = sc.nextLine();
		
		UserDTO loginUser = (UserDTO)Session.get("loginUser");
		
		ProductDTO newProduct = new ProductDTO(pdao.getLastNum()+1,prodname,
				prodprice,prodamount, prodinfo, loginUser.userid);
		
		if(pdao.addProduct(newProduct)) {
			System.out.println(prodname+" ��ǰ �߰� �Ϸ�");
		}
		else {
			System.out.println("��ǰ �߰� ���� / ������ �ٽ� �õ��� �ּ���.");
		}
		
	}
}












