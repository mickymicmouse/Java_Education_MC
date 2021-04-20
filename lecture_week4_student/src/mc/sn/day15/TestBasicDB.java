package mc.sn.day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBasicDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBasicDB tb = new TestBasicDB();
		
		try {
			tb.selectGisaTable();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void selectGisaTable() throws ClassNotFoundException, 
													SQLException {
		//gisaTBL���̺� �����Ͽ� ��� ������ ��ȸ�Ͽ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		//13�� 30�б��� 
		//���ؼ� ���
		Connection con = this.getConnection();
		Statement stmt = con.createStatement();
		String sql = "select * from gisaTBL";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int stdNo = rs.getInt("stdNo"); //�ε����� ������ 1����
			String email = rs.getString("email");
			System.out.println(stdNo+","+email);
		}
		rs.close();
		stmt.close();
		con.close();
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		
		Class.forName(driver);
		con = DriverManager.getConnection(jdbcURL,id,pwd);
		
		return con;
	}

}
