package road;

public class Road2 {
	public static void main(String[] args) {
//		SuperCar mycar = new SuperCar("Ferrari", "Red", 65000);
//		Car momcar = new Car("K7", "White", 6000);
//		Car dadcar = new Car("Genesis", "Black", 10000);
//		mycar.engineStart();
//		momcar.engineStart();
//		dadcar.engineStart();
		
		Car[] garage = {
				 new SuperCar("Ferrari", "Red", 65000),
				 new Car("K7", "White", 6000),
				 new Car("Genesis", "Black", 10000)
		};
		
		for (int i = 0; i < garage.length; i++) {
			garage[i].engineStart();
			if(garage[i] instanceof SuperCar) {
				((SuperCar)garage[i]).roofOpen();
			}
		}
		
//		Object obj = new Car();
//		Object obj2 = 23;
//		Object obj3 = ""; 
		
	}
}







