package cage;

public abstract class Animal {
	String name;
	String gender;
	int age;
	
	public void eat() {
		System.out.println(name+"ÀÌ(°¡) ³È³È ¸Ô´ÂÁß...");
	}
	
	public abstract void move();
	
	public abstract void makeSomeNoise();
}
