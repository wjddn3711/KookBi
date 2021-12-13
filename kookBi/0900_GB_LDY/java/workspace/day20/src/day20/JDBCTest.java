package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] args) {
		String sql = "SELECT NOW() FROM dual";
		
		try {
			//설계도 읽기
			Class.forName("com.mysql.cj.jdbc.Driver");
			//다리 지을 위치와 방법 정하기
			String url = "jdbc:mysql://localhost/testworld";
			String user = "root";
			String password = "1234";

			//지어진 다리 돌려받기
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//다리 위를 왔다갔다 할 택배차 뽑아내기
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//택배물 전달하고 쿼리문 수행시키기
			ResultSet rs = ps.executeQuery();
			
			//rs.next() : rs의 화살표를 하나 이동시키고(행을 하나 이동) 가리키고 있는 행이
			//			존재한다면 true / 존재하지 않는다면 false
			if(rs.next()) {
				String data = rs.getString("NOW()");
				System.out.println(data);
			}else {
				System.out.println("데이터가 존재하지 않습니다.");
			}
			
			sql = "INSERT INTO test (strdata,timedata) VALUES(?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, "apple");
			ps.setString(2, "2021-12-13 10:36:52");
			
			//INSERT, UPDATE, DELETE	: executeUpdate() - 수정된 행의 수 return
			//SELECT					: executeQuery() - 검색 결과 테이블(ResultSet) return
			int result = ps.executeUpdate();
			if(result == 1) {
				System.out.println("데이터 추가 성공!");
			}else {
				System.out.println("데이터 추가 실패!");
			}
			
			
			sql = "SELECT * FROM test";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			System.out.println("----test 테이블 전체내용----");
			
			while(rs.next()) {
				int intdata = rs.getInt("intdata");
				//데이터를 받아올 때에는 컬럼의 위치(순번)로도 가능하다.
				String strdata = rs.getString(2);
				String timedata = rs.getString("timedata");
				
				System.out.println(intdata+" / "+strdata+" / "+timedata);
			}
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("드라이버 로딩 실패 : "+cnfe);
		} catch(SQLException sqle) {
			System.out.println("데이터베이스 연결 실패 : "+sqle);
		}
	}
}





