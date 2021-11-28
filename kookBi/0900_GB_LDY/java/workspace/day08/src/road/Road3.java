package road;

public class Road3 {
	public static void main(String[] args) {
		Car mycar = new Car("KIA","Black",2000);
		Car momcar = new Car("Morning", "Mint", 1300);
		mycar.engineStart();
		mycar.wheel--;
		mycar.engineStop();
		
		momcar.engineStart();
		System.out.println(momcar.wheel);
		System.out.println(Car.wheel);
	}
}
