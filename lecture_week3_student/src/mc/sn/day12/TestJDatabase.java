package mc.sn.day12;


import java.sql.*;

public class TestJDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJDatabase td = new TestJDatabase();
		try {
			td.connectDB();
		} catch (ClassNotFoundException c) {
			c.getMessage();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	private void connectDB() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		Class.class.forName(driver);
		Connection con = DriverManager.getConnection(jdbcURL, id, pwd);
		if (con!=null) {
			System.out.println("connected");
			con.close();
			
		} else {
			System.out.println("failed");
		}
	}
}
