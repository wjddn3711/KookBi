package collection;

import java.util.ArrayList;

public class ArListTest3 {
	public static void main(String[] args) {
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("apple", "김사과"));
		userList.add(new User("banana", "반하나"));
		userList.add(new User("cherry","이체리"));
		
		System.out.println(userList);
		
		userList.remove(new User("banana", "반하나"));
		System.out.println(userList);
	}
}
class User{
	int usernum;
	String userid;
	String username;
	
	public User(String userid, String username) {
		this.userid = userid;
		this.username = username;
	}
	
	public User(int usernum, String userid, String username) {
		this.usernum = usernum;
		this.userid = userid;
		this.username = username;
	}

	@Override
	public String toString() {
		return userid+"/"+username;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User target = (User)obj;
			
//			if(target.userid.equals(userid)) {
//				return true;
//			}
			return target.userid.equals(userid);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return usernum;
	}
}









