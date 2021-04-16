package mc.sn.day13;

import java.sql.*;
import com.sun.jdi.connect.spi.Connection;

public class ReviewDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReviewDB rd = new ReviewDB();
		
		try {
			rd.connectDB();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private void connectDB() throws SQLException, ClassNotFoundException{
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		Class.forName(driver);
		java.sql.Connection con = DriverManager.getConnection(jdbcUrl, id, pwd);
		
		if (con!=null) {
			System.out.println("success");
			con.close();
		}else {
			System.out.println("fail");
		}
	}

}
