package shape;

public class Square extends Shape{

	public Square(int lineCnt, double width, double height) {
		super(lineCnt, width, height);
	}

	@Override
	double getArea() {
		area = width*height;
		return area;
	}
	
//	@Override
//	void init() {
//		System.out.println("나는 도형이 절대 아닙니다.");
//	}
	
	
}
