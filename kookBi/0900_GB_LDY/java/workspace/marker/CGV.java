package marker;

public class CGV {
	public static void main(String[] args) {
		Movie[] list = {
				new Eternals("ÀÌÅÍ³ÎÁî"),
				new Dune("µá"),
				new Venom("º£³ğ2")
		};
		for (int i = 0; i < list.length; i++) {
			if(list[i] instanceof Marvle) {
				list[i].show();
			}
		}
	}
}
