package zoo;

public class Ground {
	public static void main(String[] args) {
		//���� ������ ���� ����ϱ�
		//�� ������ �����Ҹ� �ٸ���
		//�� �������� Ư¡���� �ൿ�� �ϳ��� �ϱ�
		//Brachiosaurus	Hypsipetes hippocampus
		Brachiosaurus br = new Brachiosaurus("�Ѹ�����", "����", 100000038);
		Hypsipetes hy = new Hypsipetes("����","����",4);
		Hippocampus hi = new Hippocampus("���丶", "����", 6);

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
