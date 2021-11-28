package bms;

public class Bank {
	String account;
	String pw;
	String name;
	int balance;
	
	
	
	public Bank(String account, String pw, String name) {
		this.account = account;
		this.pw = pw;
		this.name = name;
		this.balance = 0;
	}
	//ภิฑÝ
	void deposit(int money) {
		this.balance += money;
	}
	//รโฑÝ
	void withdraw(int money) {
		if(balance>=money) {
			this.balance -= money;
		}
	}
	//ภÜพืบธฑโ
	void show() {
		//ฑ่ป็ฐ๚ดิ ฐ่มย(10357)
		//ภÜพื : 1ฟ๘
		System.out.println(name+"ดิ ฐ่มย("+account+")\nภÜพื : "+balance+"ฟ๘");
	}
}




