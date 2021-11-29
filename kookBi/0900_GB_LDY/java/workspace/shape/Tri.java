package shape;

public class Tri extends Shape{
	
	public Tri(int lineCnt, double width, double height) {
		super(lineCnt, width, height);
	}

	@Override
	double getArea() {
		area = width*height/2;
		return area;
	}
}
