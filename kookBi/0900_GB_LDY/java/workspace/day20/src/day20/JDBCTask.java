package day20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestDAO tdao = new TestDAO();
		System.out.print("추가할 데이터 : ");
		String data = sc.nextLine();
		if(tdao.insertData(data)) {
			System.out.println("데이터 추가 성공!");
		}
		if(tdao.changeToBanana()) {
			System.out.println("알고보니 바나나였음");
		}
	}
}
class TestDAO{
	Connection conn;
	PreparedStatement ps;
//	문자열 하나 입력받아서 test테이블에 해당 데이터 추가
//	timedata는 현재 시간으로 추가
	boolean insertData(String data) {
		String sql = "INSERT INTO test (strdata,timedata) VALUES(?,NOW())";
		conn = DBConnection.getConnection();
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, data);
			result = ps.executeUpdate();
			
		} catch (SQLException sqle) {
			System.out.println("쿼리문 오류 : "+sqle);
		}
		return result == 1;
	}
	
//	기존에 추가된 'apple' 이 있는 행의 데이터들 중
//	두번째 데이터부터는 'banana'로 수정
	boolean changeToBanana() {
		String sql = "SELECT intdata FROM test WHERE strdata='apple' ORDER BY intdata LIMIT 1,100";
		conn = DBConnection.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int pk = rs.getInt("intdata");
				sql = "UPDATE test SET strdata = 'banana' WHERE intdata = "+pk;
				
				ps = conn.prepareStatement(sql);
				int result = ps.executeUpdate();
				if(result != 1) {
					System.out.println("문제 발생");
					return false;
				}
			}
		} catch (SQLException sqle) {
			System.out.println("쿼리문 오류 : "+sqle);
		}
		return true;
	}
}












