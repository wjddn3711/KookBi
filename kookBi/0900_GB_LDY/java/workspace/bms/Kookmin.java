package bms;

//1000�� �Աݽ� 500���� �Ա� 
public class Kookmin extends Bank{

	public Kookmin(String account, String pw, String name) {
		super(account, pw, name);
	}
	
	@Override
	void deposit(int money) {
		money /= 2;
		super.deposit(money);
	}
	
}
