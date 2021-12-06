package view;

import java.util.Scanner;

import dao.ProductDAO;

public class ModifyProductView {
	public ModifyProductView() {
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		System.out.print("수정할 상품 번호 : ");
		int prodnum = sc.nextInt();
		System.out.println("1. 가격수정\n2. 재고수정\n3. 설명수정");
		int choice = sc.nextInt();
		System.out.print("새로운 정보 : ");
		sc = new Scanner(System.in);
		String newData = sc.nextLine();
		
		if(pdao.modifyProduct(prodnum,choice,newData)) {
			System.out.println(prodnum+"번 상품이 정상적으로 수정되었습니다.");
		}
		else {
			System.out.println("상품 수정 실패 / 다음에 다시 시도해 주세요.");
		}
	}
}
