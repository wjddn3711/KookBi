package shape;

public class Board {
	public static void main(String[] args) {
		Tri mt = new Tri(3, 70000, 50000);
		Square monitor = new Square(4, 71, 40);
		
		System.out.println("산의 면적 : "+mt.getArea()+"cm²");
		System.out.println("모니터의 면적 : "+monitor.getArea()+"cm²");
		
		mt.init();
		monitor.init();
	}
}
