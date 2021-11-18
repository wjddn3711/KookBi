package day03;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n1. C언어\n2. Java\n3. 망둥어\n4. 파이썬");
		choice = sc.nextInt();
		if(choice == 3) {
			System.out.println("정답입니다.");
		}else if(choice == 1 || choice == 2 || choice == 4) {
			//~~이고, ~~ 고, ~~ 하고, 그리고, ~~이며, ~~하며 : &&
			//~~ 또는, ~~ 혹은, ~~ 거나 : || 
			System.out.println("오답입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
