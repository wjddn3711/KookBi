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
	
//	final �޼ҵ�� �ڽĿ��� ���� �����ǰ� �Ұ����ϴ�.
	final void init() {
		System.out.println("�ȳ��ϼ��� ���� �����Դϴ�.");
	}
	//��ӹ޴� ��� ���� Ŭ�����鿡�� �ʼ��� ������
	abstract double getArea();
	
}
