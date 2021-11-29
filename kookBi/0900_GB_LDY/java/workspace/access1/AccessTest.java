package access1;

public class AccessTest {
	int data1 = 10;
	public int data2 = 20;
	private int data3 = 30;
	protected int data4 = 40;
	
	//Alt + Shift + S > R : getter, setter 메소드 만들기
	//getter 메소드
	public int getData3() {
		return data3;
	}
	//setter 메소드
	public void setData3(int data3) {
		this.data3 = data3;
	}
	
}
