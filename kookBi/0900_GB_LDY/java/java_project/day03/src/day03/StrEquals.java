package day03;

import java.util.Scanner;

//Window Key + . : 이모지
public class StrEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg1 = "Hello";
		String msg2 = "";
		System.out.print("인사 해주세요 ~ ");
		msg2 = sc.next();
		
		//"문자열1".equals("문자열2") : "문자열1"과 "문자열2"가 같은 문자열이면 true / 아니라면 false
		if( msg1.equals(msg2) ) {
			System.out.println("인사 받아줘서 고마워요♡");
		}else {
			System.out.println("성격이 참 나쁘시네요......");
		}
		
//		switch(msg2) {
//		case "Hello":
//			
//			break;
//		default:
//			
//		}
		
	}
}






