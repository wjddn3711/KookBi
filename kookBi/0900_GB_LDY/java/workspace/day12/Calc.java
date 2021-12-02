package day12;

public class Calc {
	public static void main(String[] args) {
//		Math.ceil(실수)	: 소수점 첫째자리에서 올림
		System.out.println(Math.ceil(19.11));
//		Math.floor(실수)	: 소수점 첫째자리에서 내림
		System.out.println(Math.floor(19.99));
//		Math.round(실수)	: 소수점 첫째자리에서 반올림
		System.out.println(Math.round(19.4999));
		System.out.println(Math.round(19.5));
		
//		특정한 자리에서 하고싶은 경우
//		11.48 --> 11.5	(둘째자리에서 반올림)
//		1. *10을 함
//			114.8
//		2. 반올림
//			115.0
//		3. 다시 10.0으로 나누기
//			11.5
		
//		Math.sqrt(실수)	: 루트
		System.out.println(Math.sqrt(4));
//		Math.pow(a,b)	: 거듭제곱(a의 b승)
		System.out.println(Math.pow(3, 3));
//		Math.abs(실수)	: 절대값
		System.out.println(Math.abs(-21.1174));
	}
}




