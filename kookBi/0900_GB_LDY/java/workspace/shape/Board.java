package shape;

public class Board {
	public static void main(String[] args) {
		Tri mt = new Tri(3, 70000, 50000);
		Square monitor = new Square(4, 71, 40);
		
		System.out.println("���� ���� : "+mt.getArea()+"cm��");
		System.out.println("������� ���� : "+monitor.getArea()+"cm��");
		
		mt.init();
		monitor.init();
	}
}
