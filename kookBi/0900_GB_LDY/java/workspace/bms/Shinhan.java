package bms;

//500�� ��ݽ� 1000�� ���
public class Shinhan extends Bank{

	public Shinhan(String account, String pw, String name) {
		super(account, pw, name);
	}
	
	@Override
	void withdraw(int money) {
		money *= 2;
		super.withdraw(money);
	}
	
}
