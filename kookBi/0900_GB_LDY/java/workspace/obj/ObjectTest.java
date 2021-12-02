package obj;

public class ObjectTest {
	public static void main(String[] args) {
		Test obj = new Test(10, 11.11);
		
		//println을 선배가 선언할 당시에는 우리가 후에 어떤것을
		//그 메소드를 이용해서 출력할지 알 수 없기 때문에
		//println은 Object 타입의 매개변수가 선언되어 있고
		//아무거나 하나 넘겨라 / 객체 하나 넘겨라 라는 뜻이다.
		System.out.println(obj);
		//println은 외부에서 어떤 객체를 넘겨주게 되면
		//내부에서 그 객체.toString()을 사용해서 출력한다.
		//.toString()을 붙여서 출력하게 되면 toString()을
		//사용한 부분 통째로 문자열이므로 단순한 문자열 출력이다.
		System.out.println(obj.toString());
		
	}
}








