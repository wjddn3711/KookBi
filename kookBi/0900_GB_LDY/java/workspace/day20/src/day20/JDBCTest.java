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
			//���赵 �б�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//�ٸ� ���� ��ġ�� ��� ���ϱ�
			String url = "jdbc:mysql://localhost/testworld";
			String user = "root";
			String password = "1234";

			//������ �ٸ� �����ޱ�
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//�ٸ� ���� �Դٰ��� �� �ù��� �̾Ƴ���
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//�ù蹰 �����ϰ� ������ �����Ű��
			ResultSet rs = ps.executeQuery();
			
			//rs.next() : rs�� ȭ��ǥ�� �ϳ� �̵���Ű��(���� �ϳ� �̵�) ����Ű�� �ִ� ����
			//			�����Ѵٸ� true / �������� �ʴ´ٸ� false
			if(rs.next()) {
				String data = rs.getString("NOW()");
				System.out.println(data);
			}else {
				System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
			}
			
			sql = "INSERT INTO test (strdata,timedata) VALUES(?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, "apple");
			ps.setString(2, "2021-12-13 10:36:52");
			
			//INSERT, UPDATE, DELETE	: executeUpdate() - ������ ���� �� return
			//SELECT					: executeQuery() - �˻� ��� ���̺�(ResultSet) return
			int result = ps.executeUpdate();
			if(result == 1) {
				System.out.println("������ �߰� ����!");
			}else {
				System.out.println("������ �߰� ����!");
			}
			
			
			sql = "SELECT * FROM test";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			System.out.println("----test ���̺� ��ü����----");
			
			while(rs.next()) {
				int intdata = rs.getInt("intdata");
				//�����͸� �޾ƿ� ������ �÷��� ��ġ(����)�ε� �����ϴ�.
				String strdata = rs.getString(2);
				String timedata = rs.getString("timedata");
				
				System.out.println(intdata+" / "+strdata+" / "+timedata);
			}
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("����̹� �ε� ���� : "+cnfe);
		} catch(SQLException sqle) {
			System.out.println("�����ͺ��̽� ���� ���� : "+sqle);
		}
	}
}





