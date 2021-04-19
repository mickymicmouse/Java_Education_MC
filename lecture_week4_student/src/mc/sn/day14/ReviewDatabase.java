package mc.sn.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ReviewDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewDatabase rd = new ReviewDatabase();
		try {
			rd.testConnectDB();
			rd.testQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	
	public Connection testConnectDB() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		// ���� ���
		String jdbcuri = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		// ����̹� �ε� (���� �������� �����ص� ��)
		Class.forName(driver);
		// Ŀ�ؼ� �����
		Connection con = DriverManager.getConnection(jdbcuri, id, pwd);
		
		if (con!=null) {
			System.out.println("success");
//			con.close();
		}else {
			System.out.println("fail");
		}
		
		return con;
	}
	
	public void testQuery() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = this.testConnectDB();
		String sql = "INSERT INTO testTBL2(id,username,age) "
				+ "VALUES (7,'lee','addr')";
		// id�� 2���� userName�� lee�� �����ϴ� ������ �ۼ��Ͻÿ�.
		sql = "UPDATE testTBL2 SET userName='lee' WHERE id = 2";
		// userName �� kim�� �ڷḦ ��� �����ϴ� ������ �ۼ��Ͻÿ�.
		sql = "DELETE FROM testTBL2 where userName = 'kim'";
		sql = "CREATE TABLE testTBL3 "
				+ "(id NUMBER PRIMARY KEY, username VARCHAR2, age NUMBER) ";
		// ������ ������ ��� ����
		// connection ���� ���� DB������ ������ ������ new�� ������ ����.
		System.out.println(sql);
		Statement stmt = con.createStatement();
		int affectedCount = stmt.executeUpdate(sql);
		if(affectedCount>0) {
			System.out.println("�Է¿Ϸ�");
		} else {
			System.out.println("�Է½���");
		}
		stmt.close();
		con.close();
	}


	
	
	
	

}
