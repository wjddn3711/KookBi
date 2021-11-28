package zoo;

public class Animal {
	String name;
	String gender;
	int age;
	
	public Animal() {}
	
	public Animal(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	void eat() {
		System.out.println(name+"이(가) 냠냠 먹는중...");
	}
	void sleep() {
		System.out.println(name+"이(가) 쿨쿨 자는중...");
	}
	void move() {
		System.out.println(name+"이(가) 움직이는중...");
	}
	void makeSomeNoise() {
		System.out.println(name+"이(가) 소리내어 우는중...");
	}
}
