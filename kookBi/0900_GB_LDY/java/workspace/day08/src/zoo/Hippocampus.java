package zoo;

public class Hippocampus extends Animal{

	public Hippocampus() {
		super();
	}

	public Hippocampus(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void move() {
		System.out.println("≤ø∏Æ∑Œ «ÿ√ ∞®±‚");
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("¿∏∏£∑∑ ¿∏∏£∑∑ ¿∏∏£∑∑¥Î");
	}
	
	void shootBubble() {
		System.out.println("¡÷µ’¿Ãø°º≠ π∞πÊøÔ ΩÓ±‚");
	}
	
}



