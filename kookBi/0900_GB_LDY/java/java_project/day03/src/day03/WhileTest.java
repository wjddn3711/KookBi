package day03;

import java.util.Scanner;

//Ctrl + M : 현재 창 최대크기로
public class WhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
//		while(choice != 3) {
//			System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n1. C언어\n2. Java\n3. 망둥어\n4. 파이썬");
//			choice = sc.nextInt();
//			if(choice == 3) {
//				System.out.println("정답입니다.");
//			}else if(choice == 1 || choice == 2 || choice == 4) {
//				System.out.println("오답입니다.");
//			}else {
//				System.out.println("잘못 입력하셨습니다.");
//			}
//		}
		
//		do {
//			System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n1. C언어\n2. Java\n3. 망둥어\n4. 파이썬\n0. 나가기");
//			choice = sc.nextInt();
//			if(choice == 3) {
//				System.out.println("정답입니다.");
//			}else if(choice == 1 || choice == 2 || choice == 4) {
//				System.out.println("오답입니다.");
//			}else if(choice == 0) {
//				System.out.println("안녕히가세요........☆");
//			} else {
//				System.out.println("잘못 입력하셨습니다.");
//			}
//		}while(choice != 0);
		
		while(true){
			System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n1. C언어\n2. Java\n3. 망둥어\n4. 파이썬\n0. 나가기");
			choice = sc.nextInt();
			if(choice == 3) {
				System.out.println("정답입니다.");
				break;
			}else if(choice == 1 || choice == 2 || choice == 4) {
				System.out.println("오답입니다.");
			}else if(choice == 0) {
				System.out.println("안녕히가세요........☆");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
}







