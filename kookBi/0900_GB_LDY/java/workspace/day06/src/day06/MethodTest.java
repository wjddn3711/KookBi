package day06;

public class MethodTest {
	public static void main(String[] args) {
		
	}
	
	//f(x) = 2x+1
	int f(int x) {
//		x = 넘기는값;
		return 2*x+1;
	}
	
	//내이름("정다솔")을 10번 출력하는 메소드
	void printName() {
		for (int i = 0; i < 10; i++) {
			System.out.println("정다솔");
		}
		
	}
	
	//현재 시간정보를 알려주는 메소드
//	시간타입 getTime() {
//		return 시간정보;
//	}
	
//	구구단의 단 출력하는 메소드
	void printDan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		}
	}
}










