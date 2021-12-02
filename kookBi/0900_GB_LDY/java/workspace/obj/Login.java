package obj;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User[] arUser = {
				new User("apple", "abcd1234", "����"),
				new User("banana", "abcd1234", "���ϳ�"),
				new User("cherry", "abcd1234", "��ü��"),
				new User("durian", "abcd1234", "���θ�")
		};
		System.out.print("���̵� : ");
		String userid = sc.next();
		System.out.print("��й�ȣ : ");
		String userpw = sc.next();
		
		User trying = new User(userid, userpw);
		
		for (int i = 0; i < arUser.length; i++) {
			if(arUser[i].equals(trying)) {
				System.out.println(arUser[i].username);
			}
		}
	}
}

class User{
	String userid;
	String userpw;
	String username;
	
	public User(String userid, String userpw, String username) {
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
	}

	public User(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User target = (User)obj;
			
			if(target.userid.equals(userid)) {
				if(target.userpw.equals(userpw)) {
					return true;
				}
			}
		}
		return false;
	}
	
}









