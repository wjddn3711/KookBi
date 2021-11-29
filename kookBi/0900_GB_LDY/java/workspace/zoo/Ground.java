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
//		포유류 두마리, 파충류 한마리, 조류 한마리 만들어서
//		포유류들은 울게 하고, 파충류는 움직이게 하기
//		동물이 있는 패키지는 cage 패키지
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







