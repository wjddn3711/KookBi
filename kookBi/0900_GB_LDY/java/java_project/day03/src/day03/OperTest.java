package day03;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 초기화 (정수:0, 실수:0.0, 0.0F, 문자:' ',
//		문자열:"", 논리형:보통 false, 그 외:null)
		int num = 0;
		String result = "";
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
//		result = num>0 ? "양수입니다." : "음수입니다.";
//		result = num == 0 ? "0입니다." : result;
		result = num>0 ? "양수입니다." : num == 0 ? "0입니다" : "음수입니다.";
		System.out.println(num+"은(는) "+result);
	}
}












