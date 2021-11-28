package road;

public class Road2 {
	public static void main(String[] args) {
		SuperCar mycar = new SuperCar("Ferrari","Red",65000);
		SuperCar mycar2 = new SuperCar("Porsche","Yellow",20000,"abcd");
		Car momcar = new Car("K7","White",7000);
		
		momcar.engineStart();
		mycar.engineStart();
	}
}
