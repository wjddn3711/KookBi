package zoo;

public class Brachiosaurus extends Animal{
	
	public Brachiosaurus() {}
	
	public Brachiosaurus(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	void move() {
		System.out.println("ÄôÄçÄôÄç");
	}
	void makeSomeNoise() {
		System.out.println("²ô¿¡¿¡¤Ä¤Ä¤Ä¤Ä¤¡");
	}
	void spinNeck() {
		System.out.println("±ä ¸ñÀ» »çÁ¤¾øÀÌ ÈÖµÎ¸£±â");
	}
}
