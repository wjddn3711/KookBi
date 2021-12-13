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
		System.out.print("상품 이름 : ");
		String prodname = sc.next();
		System.out.print("상품 가격 : ");
		int prodprice = sc.nextInt();
		System.out.print("상품 재고 : ");
		int prodamount = sc.nextInt();
		System.out.print("상품 소개 : ");
		sc = new Scanner(System.in);
		String prodinfo = sc.nextLine();
		
		UserDTO loginUser = (UserDTO)Session.get("loginUser");
		
		ProductDTO newProduct = new ProductDTO(pdao.getLastNum()+1,prodname,
				prodprice,prodamount, prodinfo, loginUser.userid);
		
		if(pdao.addProduct(newProduct)) {
			System.out.println(prodname+" 상품 추가 완료");
		}
		else {
			System.out.println("상품 추가 실패 / 다음에 다시 시도해 주세요.");
		}
		
	}
}












