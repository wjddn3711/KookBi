package day02;

public class Casting {
	public static void main(String[] args) {
		System.out.println(10/(3+0.0));
		
		//�ƽ�Ű �ڵ� : �� ���ڸ��� �����Ǵ� �������� ������ �ִ�.
		//'A' : 65 / 'a' : 97 / '0' : 48		
		System.out.println('A'+5);
		
		System.out.println(10+"");//"10"
		
		System.out.println((char)70);
		System.out.println((int)10.24654);
		System.out.println((int)10.99999999999);
		
		double num = 10.24;
		//������, �Ǽ��� ������
		System.out.println((int)num);
		System.out.println(num-(int)num);
		
		System.out.println((int)11.19+(int)1.87);//12
		System.out.println((int)(11.19+1.87));//13
		
		
	}
}












