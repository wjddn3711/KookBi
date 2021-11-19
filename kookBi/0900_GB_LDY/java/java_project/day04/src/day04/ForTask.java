package day04;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1부터 10까지 출력하기
//		10부터 1까지 출력하기
//		12부터 3씩 증가하며 13번 출력하기
//		100 94 88 82 .... 28 출력하기
//		1부터 10까지의 총 합 구하기
		int sum = 0;
//		sum += 1; //0+1
//		sum += 2; //0+1+2
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		sum += 10;
		for (int i = 1; i <= 10; i++) {
			//1 2 3 4 5 6 7 8 9 10
			sum += i;
		}
		System.out.println(sum);
//		n 하나 입력받아서 1부터 n까지의 총합 구하기
//		for (int i = 1; i <= n; i++) {
//			+=i;
//		}
		
//		n, m 입력받아서 n부터 m까지 출력하기
		System.out.print("n : ");
		int n = sc.nextInt();
		System.out.print("m : ");
		int m = sc.nextInt();
		
		for (int i = n; i <= m; i++) {
			System.out.println(i);
		}
//		1부터 100까지 중 짝수만 출력하기
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
//		1부터 100까지 중 3과 5의 공배수만 출력하기
		for (int i = 1; i <= 100; i++) {
			if(i%3==0 && i%5 == 0) {
				System.out.println(i);
			}
		}
//		3과 5의 공배수가 아닐 조건
//		i%3!=0 || i%5!=0
//		!(i%3==0 && i%5 == 0)
		
//		1부터 100까지 중 3의 배수와 5의 배수 중 공배수는 제외하고 출력하기
		for (int i = 1; i <= 100; i++) {
			//if문에 못들어갔다는 말은 3의 배수나 5의 배수가 아니라는 뜻
			if(i%3 == 0 || i%5 == 0) {
				//if에 못들어갔다는 말은 3과 5의 공배수라는 뜻
				if(!(i%3==0 && i%5 == 0)) {
					System.out.println(i);
				}
				
			}
		}
//		A부터 F까지 출력하기(아스키코드 이용)
//		A:65 / F:70
		for (int i = 65; i < 71; i++) {
			System.out.println((char)i);
		}
		
//		0123...2425
//		AbCd....Yz 출력하기
		
//		A(65+0)	a(97) X
//		C(65+2)	b(97+1)
//		E(65+4)	d(97+3)
		String result = "";
		for (int i = 0; i < 26; i++) {
//			if(i%2 == 0) {
//				result += (char)(65+i);
//			}else {
//				result += (char)(97+i);
//			}
			result += (char)((i%2 == 0 ? 65 : 97)+i);
		}
		
		System.out.println(result);
		
//		중첩반복문 사용하지 않고 구구단 전부 출력하기
//		0   1  2  3  4  5  6  7  8	(1단) 몫 0 / 나머지 0 ~ 8
//		9  10 11 12 13 14 15 16 17  (2단) 몫 1 / 나머지 0 ~ 8
//		18 19 20 21 22 23 24 25 26  (3단)
//		...
//		for (int i = 0; i < 81; i++) {
//			int dan = i/9+1;
//			int gop = i%9+1;
//			
//			System.out.printf("%d X %d = %d\n",dan,gop,dan*gop);
//		}
		for (int i = 0; i < 90; i++) {
			int dan = i/10+1;
			int gop = i%10;
			
			if(gop == 0) {
				System.out.printf("★☆-----%d단-----☆★\n",dan);
			}else {
				System.out.printf("%d X %d = %d\n",dan,gop,dan*gop);
			}
		}
//		10진수 숫자 입력받아서 2진수로 출력하기
//		증감식에 /= 2
		int num = 23;//10111
		String data = "";
		for (int i = num; i >=1; i/=2) {
			data = i%2+data;
		}
		System.out.println(data);
		
//		
//		ABCDefghIJKLmnopQRSTuvwxYZ 출력하기

//		4로 나눈 몫 확인
//		0 1 2 3		대문자 0
//		4 5 6 7		소문자 1
//		8 9 10 11	대문자 2
		result = "";
		for (int i = 0; i < 26; i++) {
			if((i/4)%2 == 0) {
				result += (char)(65+i);
			}else {
				result += (char)(97+i);
			}
		}
		System.out.println(result);
		
//		AbCDefGHIjklMNOPqrstUVWXYz 출력하기
		//caseType이 true값을 가지고 있다 : 대문자로 출력
		//caseType이 false값을 가지고 있다 : 소문자로 출력
		int cnt = 0;
		num = 1;
		boolean caseType = true;
		for (int i = 0; i < 26; i++) {
			if(cnt>=num){
				caseType = !caseType;
				cnt = 0;
				if(caseType == true) {
					num++;
				}
			}
			
			if(caseType == true) {
				System.out.print((char)(65+i));
			}else {
				System.out.print((char)(97+i));
			}
			cnt++;
			
			
		}
		
	}
}















