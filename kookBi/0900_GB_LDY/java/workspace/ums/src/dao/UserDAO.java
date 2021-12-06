package dao;

import java.util.HashSet;

import dto.UserDTO;

public class UserDAO {
	DBConnection conn;
	
	public UserDAO() {
		conn = new DBConnection("UserTable.txt");
	}
	public boolean join(UserDTO newUser) {
		return conn.insert(newUser.toString());
	}
	
	public boolean login(String userid, String userpw) {
		HashSet<String> rs = conn.select(0, userid);
//		{"apple","abcd1234","����","10","01012341234","����� ������ ���ﵿ"}
		for(String line : rs) {
			String[] datas = line.split("\t");
			if(userpw.equals(datas[1])) {
				//�α��� ����
				UserDTO loginUser = new UserDTO(datas);
				Session.set("loginUser", loginUser);
				return true;
			}
		}
		//�α��� ����
		return false;
	}
	public boolean checkId(String userid) {
		HashSet<String> rs = conn.select(0, userid);
		return rs.size()==0;
	}
	public boolean modifyUser(String userid, int col, String newData) {
		return conn.update(userid, col, newData);
	}
	
	
}











