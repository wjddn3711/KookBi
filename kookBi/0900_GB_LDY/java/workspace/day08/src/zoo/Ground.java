package zoo;

public class Ground {
	public static void main(String[] args) {
		//동물 세마리 만들어서 울게하기
		//각 동물은 울음소리 다르게
		//각 동물마다 특징적인 행동들 하나씩 하기
		//Brachiosaurus	Hypsipetes hippocampus
		Brachiosaurus br = new Brachiosaurus("둘리엄마", "암컷", 100000038);
		Hypsipetes hy = new Hypsipetes("직구","수컷",4);
		Hippocampus hi = new Hippocampus("적토마", "수컷", 6);

		while(true) {
			br.makeSomeNoise();
			hy.makeSomeNoise();
			hi.makeSomeNoise();
			
			br.spinNeck();
			hy.debug();
			hi.shootBubble();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
