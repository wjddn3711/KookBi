package multi_inherit;

public class D extends C implements A,B{
	@Override
	public void f() {
		System.out.println("D Ŭ������ f()");
	}
	
	void doSomething() {
//		A �������̽��� f() ȣ��
		A.super.f();
//		B �������̽��� f() ȣ��
		B.super.f();
//		C Ŭ������ f() ȣ��
		super.f();
	}
}
