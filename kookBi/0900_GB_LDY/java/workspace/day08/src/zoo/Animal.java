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
		System.out.println(name+"��(��) �ȳ� �Դ���...");
	}
	void sleep() {
		System.out.println(name+"��(��) ���� �ڴ���...");
	}
	void move() {
		System.out.println(name+"��(��) �����̴���...");
	}
	void makeSomeNoise() {
		System.out.println(name+"��(��) �Ҹ����� �����...");
	}
}
