package day07;

public class StorageTest {
	//전역변수 - 파란색
	int data=10;			//매개변수도 지역변수의 일종
	//정적변수 - 살짝 기울어짐
	static int s_data = 200;
	public static void main(String[] args) {
		StorageTest s = new StorageTest();
		s.f1();
		s.f2();
//		정적 메소드(static 메소드)에서는 일반 전역변수를 사용할 수 없음
//		data = 3000;
		System.out.println(s_data);
	}
	void f1() {
		//지역변수 - 갈색
		int f1_data = 100;
		System.out.println(data);
		System.out.println(f1_data);
		System.out.println(s_data);
	}
	void f2() {
		System.out.println(data);
//		지역변수는 해당 지역에서만 접근 가능
//		System.out.println(f1_data);
	}
}
