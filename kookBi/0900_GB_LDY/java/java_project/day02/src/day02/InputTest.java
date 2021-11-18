package day02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println(name+"님 어서오세요~");
		
		System.out.print("나이 : ");
//		sc.nextDouble();
//		sc.nextFloat();
		int age = sc.nextInt();
		System.out.println("당신은 "+age+"살입니다.");
	
		System.out.print("주소 : ");
		//위의 nextInt() 마지막에 치는 enter를 먹어 치우는 역할
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.println("사는곳 : "+addr);
	}
}
