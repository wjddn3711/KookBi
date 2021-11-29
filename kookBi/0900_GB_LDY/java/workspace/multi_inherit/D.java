package multi_inherit;

public class D extends C implements A,B{
	@Override
	public void f() {
		System.out.println("D 클래스의 f()");
	}
	
	void doSomething() {
//		A 인터페이스의 f() 호출
		A.super.f();
//		B 인터페이스의 f() 호출
		B.super.f();
//		C 클래스의 f() 호출
		super.f();
	}
}
