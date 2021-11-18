package day01;

//Ctrl + N : New창(클래스, 패키지, .. 등등 만드는 창)
public class PrintTask {
	public static void main(String[] args) {
		//------ 김사과 님의 정보 ------
		//이름 : 김사과
		//나이 : 10살
		//키 : 170.24cm
		//몸무게 : 66.24kg
		//성적 : C		
		//---------- \O/ ----------
//		System.out.println("------ " + "김사과" + " 님의 정보 ------");
//		System.out.println("이름 : " + "김사과");
//		System.out.println("나이 : " + 10 + "살");
//		System.out.println("키 : " + 170.24 + "cm");
//		System.out.println("몸무게 : " + 66.24 + "kg");
//		System.out.println("성적 : "+'C');
//		System.out.println("---------- \\O/ ----------");
		
		
//		Ctrl + Alt + ↓(↑) : 아래(위)쪽으로 한줄 복사
//		Alt + ↓(↑) : 아래(위)쪽으로 한줄 이동
		System.out.printf("------ %s 님의 정보 ------\n","김사과");
		System.out.printf("이름 : %s\n","김사과");
		System.out.printf("나이 : %d살\n",10);
		System.out.printf("키 : %.3fcm\n",170.2424687);
		System.out.printf("몸무게 : %.2fkg\n",66.24);
		System.out.printf("성적 : %c\n",'C');
		System.out.println("---------- \\O/ ----------");
		
//		10 10 10 10 10 10 10 10 10 10 ...
//		System.out.println(10+" "+10+" "+10);
		
//		%1$d : 1번째로 넘겨주는 정수값을 이 자리에 붙여라!
		System.out.printf("%1$d %1$d %1$d %1$d %1$d %1$d %1$d",10);
		
//		"키 : 170.242cm" 라는 문자열 값 자체가 필요한 경우
		String.format("키 : %.3fcm\n",170.2424687);
	}
}

















