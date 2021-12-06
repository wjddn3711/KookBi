package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dto.UserDTO;

public class MainView {
	public MainView() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("------메인화면------");
		while(true) {
			UserDTO loginUser = (UserDTO)Session.get("loginUser");
			if(loginUser == null) {
				System.out.println("로그인 후 이용하세요.");
				break;
			}
			System.out.println("1. 상품추가");
			System.out.println("2. 상품수정");
			System.out.println("3. 상품삭제");
			System.out.println("4. 내 상품 보기");
			System.out.println("5. 상품검색");
			System.out.println("6. 내 정보 수정");
			System.out.println("7. 로그아웃");
			int choice = sc.nextInt();
			
			if(choice == 7) {
				System.out.println(loginUser.username+"님 다음에 또 오세요~");
				Session.set("loginUser", null);
				break;
			}
			String list=null;
			int prodnum=0;
			switch(choice) {
			case 1:
				//상품추가
				new AddProductView();
				break;
			case 2:
				//상품수정(가격, 재고, 설명)
				list = pdao.getList(loginUser.userid);
				if(list.equals("")) {
					System.out.println("올린 상품이 없습니다.");
				}else {
					System.out.print(list);
					new ModifyProductView();
				}
				break;
			case 3:
				//상품삭제
				list = pdao.getList(loginUser.userid);
				if(list.equals("")) {
					System.out.println("올린 상품이 없습니다.");
				}
				else {
					System.out.print(list);
					System.out.print("삭제할 상품 번호 : ");
					prodnum = sc.nextInt();
					
					if(pdao.removeProduct(prodnum)) {
						//삭제성공
						System.out.println("상품 삭제 성공!");
					}
					else {
						System.out.println("상품 삭제 실패 / 다음에 다시 시도해 주세요.");
					}
				}
				break;
			case 4:
				//내상품보기
				System.out.println("========내가 올린 상품목록========");
				list = pdao.getList(loginUser.userid);
				if(list.equals("")) {
					System.out.println("올린 상품이 없습니다.");
				}
				else {
					System.out.print(list);
				}
				System.out.println("============================");
				break;
			case 5:
				//상품검색
				break;
			case 6:
				//내정보수정
				new MyInfoView();
				break;
			}
		}
	}
}







