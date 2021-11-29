package shape;

public abstract class Shape {
	int lineCnt;
	double area;
	double width;
	double height;
	
	public Shape(int lineCnt, double width, double height) {
		this.lineCnt = lineCnt;
		this.width = width;
		this.height = height;
	}
	
//	final 메소드는 자식에서 절대 재정의가 불가능하다.
	final void init() {
		System.out.println("안녕하세요 저는 도형입니다.");
	}
	//상속받는 모든 도형 클래스들에서 필수로 재정의
	abstract double getArea();
	
}
