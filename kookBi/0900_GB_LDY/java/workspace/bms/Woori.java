package bms;

//ÀÜ¾× Á¶È¸½Ã ÀÜ¾× Àý¹Ý
public class Woori extends Bank{

	public Woori(String account, String pw, String name) {
		super(account, pw, name);
	}
	
	@Override
	void show() {
		balance /= 2;
		super.show();
	}
	
}
