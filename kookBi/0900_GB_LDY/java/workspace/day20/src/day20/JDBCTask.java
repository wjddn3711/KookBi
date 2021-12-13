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
		System.out.print("�߰��� ������ : ");
		String data = sc.nextLine();
		if(tdao.insertData(data)) {
			System.out.println("������ �߰� ����!");
		}
		if(tdao.changeToBanana()) {
			System.out.println("�˰��� �ٳ�������");
		}
	}
}
class TestDAO{
	Connection conn;
	PreparedStatement ps;
//	���ڿ� �ϳ� �Է¹޾Ƽ� test���̺� �ش� ������ �߰�
//	timedata�� ���� �ð����� �߰�
	boolean insertData(String data) {
		String sql = "INSERT INTO test (strdata,timedata) VALUES(?,NOW())";
		conn = DBConnection.getConnection();
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, data);
			result = ps.executeUpdate();
			
		} catch (SQLException sqle) {
			System.out.println("������ ���� : "+sqle);
		}
		return result == 1;
	}
	
//	������ �߰��� 'apple' �� �ִ� ���� �����͵� ��
//	�ι�° �����ͺ��ʹ� 'banana'�� ����
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
					System.out.println("���� �߻�");
					return false;
				}
			}
		} catch (SQLException sqle) {
			System.out.println("������ ���� : "+sqle);
		}
		return true;
	}
}












