package bms;

//�ܾ� ��ȸ�� �ܾ� ����
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
