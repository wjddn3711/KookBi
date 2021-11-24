package day07;

public class Zoo {
	public static void main(String[] args) {
		//이름, 나이, 성별, 종
		//먹기, 자기, 움직이기, 울기
		//동물 세마리 만들어서 울게하기
		Animal sphinx = new Animal("핑크", 4521, "암컷", "스핑크스");
		Animal flea = new Animal("시장", 1, "수컷","벼룩");
		Animal tegu = new Animal("리오넬메시", 34, "남성", "아르헨티나테구");
		
		sphinx.makeSomeNoise();
		flea.makeSomeNoise();
		tegu.makeSomeNoise();
		
		sphinx.move();
		flea.move();
		tegu.move();
	}

}
//회원
//꽃집 프로그램에서 사용될만한 클래스
//K-리그에서 근무하는 내가 써야되는 클래스

class Animal{
	String name;
	int age;
	String gender;
	String type;
	
	//Alt + Shift + S > O : 필드를 이용해서 생성자 만들기
	public Animal(String name, int age, String gender, String type) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.type = type;
	}
	
	void eat() {
		System.out.println(name+"이(가) 냠냠 먹는중...");
	}
	void sleep() {
		System.out.println(name+"이(가) 쿨쿨 자는중...");
	}
	void move() {
		System.out.println(name+"이(가) 쿵쾅쿵쾅 움직이는중...");
	}
	void makeSomeNoise() {
		System.out.println(name+"이(가) 쿠ㅏㄹ어미냐허대 우는중...");
	}
}






