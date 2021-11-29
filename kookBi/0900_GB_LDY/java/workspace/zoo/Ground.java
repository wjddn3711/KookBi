package zoo;

import cage.Animal;
import cage.Dugong;
import cage.Gorilla;
import cage.KomodoDragon;
import cage.Mammal;
import cage.Pigeon;
import cage.Reptile;

public class Ground {
	
	public static void main(String[] args) {
//		������ �θ���, ����� �Ѹ���, ���� �Ѹ��� ����
//		���������� ��� �ϰ�, ������� �����̰� �ϱ�
//		������ �ִ� ��Ű���� cage ��Ű��
		Animal[] arAnimal = {
				new Dugong(),
				new KomodoDragon(),
				new Gorilla(),
				new Pigeon()
		};
		for (int i = 0; i < arAnimal.length; i++) {
			if(arAnimal[i] instanceof Mammal) {
				arAnimal[i].makeSomeNoise();
			}
			else if(arAnimal[i] instanceof Reptile) {
				arAnimal[i].move();
			}
		}
	}
}







