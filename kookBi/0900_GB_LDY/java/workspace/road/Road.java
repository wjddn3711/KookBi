package road;

public class Road {
	public static void main(String[] args) {
		Car brokenFerrari = new SuperCar("Ferrari","Red",65000);

//		��ĳ���� ��ü�� �ڽĿ��� �߰��� ������ �� �� ����.
//		brokenFerrari.roofOpen();
		
//		�������̵� �޼ҵ�� �ڽİ����� ���
		brokenFerrari.engineStart();
		
		((SuperCar)brokenFerrari).roofOpen();
		
//		�ٿ�ĳ������ �Ź� ���� ���ó�� ��ȣ�� �����ָ� �ؾ��ϰ� �������� ��������.
//		�׷��� ���� �ٿ�ĳ���� �� ����� �ƿ� �ڽİ�ü�� ��Ƶд�.
		SuperCar fixedFerrari = (SuperCar)brokenFerrari;
		fixedFerrari.roofOpen();
		fixedFerrari.roofOpen();
		fixedFerrari.roofOpen();
		
	}
}






