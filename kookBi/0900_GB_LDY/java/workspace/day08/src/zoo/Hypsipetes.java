package zoo;

public class Hypsipetes extends Animal{

	public Hypsipetes() {}
	public Hypsipetes(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void move() {
		System.out.println("파닥파닥");
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("삐이이이이ㅣ이잉이이이이이이ㅣㅇ이ㅣㄱ!");
	}
	
	void debug() {
		System.out.println("코딩의 오류 찾기");
	}
	
}
