package mc.sn.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestQuery tq = new TestQuery();
		try {
			tq.query1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query1() throws ClassNotFoundException, SQLException {
		Connection con = this.getConnection();
		String sql = "INSERT INTO testTBL2(id,username,age) "
				+ "VALUES (7,'lee','addr')";
		// id가 2번인 userName을 lee로 변경하는 쿼리를 작성하시오.
		sql = "UPDATE testTBL2 SET userName='lee' WHERE id = 2";
		// userName 이 kim인 자료를 모두 삭제하는 쿼리를 작성하시오.
		sql = "DELETE FROM where userName = 'kim'";
		Statement stmt = con.createStatement();
		int affectedCount = stmt.executeUpdate(sql);
		if(affectedCount>0) {
			System.out.println("입력완료");
		} else {
			System.out.println("입력실패");
		}
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
