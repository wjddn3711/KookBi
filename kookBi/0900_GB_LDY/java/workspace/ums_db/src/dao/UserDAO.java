package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.UserDTO;

public class UserDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	public boolean join(UserDTO newUser) {
		String sql = "INSERT INTO user VALUES(?,?,?,?,?,?)";
		int result = 0;
		conn = DBConnection.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, newUser.userid);
			ps.setString(2, newUser.userpw);
			ps.setString(3, newUser.username);
			ps.setInt(4, newUser.userage);
			ps.setString(5, newUser.userphone);
			ps.setString(6, newUser.useraddr);
			
			result = ps.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("������ ���� : "+sqle);
		}
		return result == 1;
	}
	
	public boolean login(String userid, String userpw) {
		String sql = "SELECT * FROM user WHERE userid = ? AND userpw = ?";
		conn = DBConnection.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, userid);
			ps.setString(2, userpw);
			
			rs = ps.executeQuery();
			
			//->	apple	abcd1234	����	10	01012341234	����� ������ ���ﵿ
			if(rs.next()) {
				//�α��� ����
				UserDTO loginUser = new UserDTO(
						rs.getString("userid"),//userid
						rs.getString("userpw"),//userpw
						rs.getString("username"),
						rs.getInt("userage"),
						rs.getString("userphone"),
						rs.getString("useraddr")
						);
				Session.set("loginUser", loginUser);
				return true;
			}
			//����
		} catch (SQLException sqle) {
			System.out.println("������ ���� : "+sqle);
		}
		return false;
	}
	public boolean checkId(String userid) {
		String sql = "SELECT * FROM USER WHERE userid = ?";
		conn = DBConnection.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs = ps.executeQuery();
			
//			rs.next() : ���� ���� ������ �̵� �� true ����
//			�ߺ�üũ�� �������� ����� ���(true)�̹Ƿ� !���� �� ����
			return !rs.next();
		} catch (SQLException sqle) {
			System.out.println("������ ���� : "+sqle);
		}
		return false;
	}
	public boolean modifyUser(String userid, int col, String newData) {
		return false;
	}
	public boolean leaveId(String userid) {
		return false;
	}
	
	
}











