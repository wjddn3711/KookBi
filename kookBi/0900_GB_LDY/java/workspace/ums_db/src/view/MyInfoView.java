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
		System.out.printf("======%s님의 회원정보======\n아이디 : %s\n비밀번호 : %s\n"
				+"핸드폰 번호 : %s\n주소 : %s\n",loginUser.username,loginUser.userid,
				loginUser.userpw,loginUser.userphone,loginUser.useraddr);
		System.out.println("======================");
		System.out.println("1. 비밀번호 수정\n2. 핸드폰번호 수정\n3. 주소 수정\n4. 수정취소\n5. 회원탈퇴");
		int choice = sc.nextInt();
		if(choice == 4) {
			System.out.println("메인으로 돌아갑니다.");
		}else if(choice == 5) {
			//회원탈퇴
			System.out.print("비밀번호 재입력 : ");
			String userpw = sc.next();
			if(loginUser.userpw.equals(userpw)) {
				if(pdao.removeAll(loginUser.userid)) {
					if(udao.leaveId(loginUser.userid)) {
						System.out.println("그동안 이용해 주셔서 감사합니다...☆");
					}
				}
			}
			else {
				System.out.println("비밀번호 오류 / 다음에 다시 시도해주세요.");
			}
		}else {
			//정보수정
			System.out.print("새로운 정보 : ");
			sc = new Scanner(System.in);
			String newData = sc.nextLine();
			boolean check=false;
			switch(choice) {
			case 1:
				//비밀번호 수정
				check = udao.modifyUser(loginUser.userid,1,newData);
				break;
//			case 2:
//				//핸드폰번호 수정
//				udao.modifyUser(loginUser.userid,4,newData);
//				break;
//			case 3:
//				//주소 수정
//				udao.modifyUser(loginUser.userid,5,newData);
//				break;
			case 2: case 3:
				check = udao.modifyUser(loginUser.userid, choice+2, newData);
				break;
			}
			if(check) {
				System.out.println("정보 수정 완료!");
			}
			else {
				System.out.println("정보 수정 실패 / 다음에 다시 시도해 주세요.");
			}
		}
	}
}










