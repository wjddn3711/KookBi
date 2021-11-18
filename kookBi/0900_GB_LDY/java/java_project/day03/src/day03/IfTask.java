package day03;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		//사용자에게 정수 3개 입력받아서 짝수들만 출력
		//입력					결과
		//10					10
		//3						6
		//6
		
		//입력
		//	정수 3개 입력받기
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//처리
		//	위에서 입력받은 정수들 짝수인지 판단
		//		짝수라면? 출력
		//		아니라면? 넘어가기
		if(num1%2 == 0) {
			System.out.println(num1);
		}
		if(num2%2 == 0) {
			System.out.println(num2);
		}
		if(num3%2 == 0) {
			System.out.println(num3);
		}
		
		//출력
		//	X
		
			
		//사용자에게 국어점수, 수학점수, 영어점수 입력받아서 총점 출력
		//입력					결과
		//국어점수 : 100			총점 : 270점
		//수학점수 : 90
		//영어점수 : 80 
		
		//입력
		//	국어점수
		//	수학점수
		//	영어점수 입력받기
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		//처리
		//	위에서 입력받은 점수들 더하기
		int score = 0;
		score += kor;	//score = score+kor;
		score += math;	//score = score+kor+math;
		score += eng;	//score = 0+kor+math+eng;
		
		//출력
		//	위에서 구해진 총점 출력
		System.out.println("총점 : "+score+"점");
		
	}
}












