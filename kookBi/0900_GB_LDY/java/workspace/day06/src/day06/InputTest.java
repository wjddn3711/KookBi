package day06;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇÑ±ÛÀÚ : ");
//		"A".charAt(0) : 'A'
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		sc.next().toUpperCase().replace("hello", "bye").substring(2).charAt(7);
	}
}
