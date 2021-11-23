package day06;

//Ctrl + 클릭 : 선언된 곳으로 이동
public class StrTest {
	public static void main(String[] args) {
		String msg = "Hello Java!";
		
//		"문자열1".split("문자열2") : "문자열1" 을 "문자열2" 기준으로 나누기(String[] 반환)
		String[] arr1 = msg.split(" "); //{"Hello","Java!"}
		System.out.println("띄어쓰기 앞부분 : "+arr1[0]);
		System.out.println("띄어쓰기 뒷부분 : "+arr1[1]);
		String[] arr2 = msg.split("u");//split은 나누지 못한다면 전체 문자열 한개가 담겨있는 String[] 반환
		System.out.println(arr2[0]);
		
//		"문자열".charAt(n) : "문자열"의 n번째 글자(char 반환)
		char ch = msg.charAt(0);//'H'	char ch = 'H';
		System.out.println("0번째 글자 : "+ch);
		
//		"문자열1".indexOf("문자열2") : "문자열1"에서 "문자열2"가 시작하는 인덱스(int 반환)
		int idx = msg.indexOf("J");//6	int idx = 6;
		System.out.println("J의 인덱스 : "+idx);
		idx = msg.indexOf("Java");
		System.out.println("Java의 인덱스 : "+idx);
		idx = msg.indexOf("t");
		System.out.println("t의 인덱스 : "+idx);
		
//		"문자열1".equals("문자열2") : "문자열1"과 "문자열2"가 같은지 비교(boolean 반환)
		System.out.println(msg.equals("Bye Java!"));
		
//		"문자열".length() : "문자열"의 길이(int 반환)
		int len = msg.length();//11		int len = 11;
		System.out.println("문자열의 길이 : "+len);
		
//		"문자열1".replace("문자열2","문자열3") : "문자열1" 에서 "문자열2" 를 찾아 "문자열3"으로 변환(String 반환)
//											원본("문자열1")은 그대로
		String newMsg = msg.replace("Hello", "Bye"); //"Bye Java!"
		System.out.println("원본 : "+msg);
		System.out.println("바뀐 값 : "+newMsg);
		
//		"문자열".substring(n) : "문자열" 을 n부터 끝까지 잘라서 돌려주기(String 반환)
		String subMsg1 = msg.substring(6);//"Java!"
		System.out.println("6번째부터 끝까지 : "+subMsg1);
		
//		"문자열".substring(n,m) : "문자열" 을 n부터 m 이전까지 잘라서 돌려주기(String 반환)
		String subMsg2 = msg.substring(6,8);//"Ja"
		System.out.println("6번째부터 8 이전까지 : "+subMsg2);
		
//		"문자열".trim() : "문자열" 양 옆에 있는 공백들을 제거(String 반환)
		System.out.println("                        Java                                ".trim());
		
//		실제 원본값 바꾸기
		msg = msg.replace("Hello", "Bye");
		System.out.println(msg);
		
	}
}















