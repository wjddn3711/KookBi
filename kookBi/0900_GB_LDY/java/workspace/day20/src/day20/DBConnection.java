package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn;
	
	public static Connection getConnection() {
		if(conn == null) {
			//�ٸ� �����
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/testworld";
				String user = "root";
				String password = "1234";
				
				conn = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				System.out.println("����̹� �ε� ���� : "+e);
			} catch(SQLException sqle) {
				System.out.println("DB ���� ���� : "+sqle);
			}
		}
		return conn;
	}
}
