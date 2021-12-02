package obj;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User[] arUser = {
				new User("apple", "abcd1234", "김사과"),
				new User("banana", "abcd1234", "반하나"),
				new User("cherry", "abcd1234", "이체리"),
				new User("durian", "abcd1234", "차두리")
		};
		System.out.print("아이디 : ");
		String userid = sc.next();
		System.out.print("비밀번호 : ");
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









