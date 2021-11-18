package day03;

import java.util.Scanner;

//Ctrl + Shift + F : 자동 정렬
public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n1. C언어\n2. Java\n3. 망둥어\n4. 파이썬");
		choice = sc.nextInt();
		switch (choice) {
		case 3:
			System.out.println("정답입니다.");
			break;
		case 1:
		case 2:
		case 4:
			System.out.println("오답입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

	}
}
