package mc.sn.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReviewDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewDB rd = new ReviewDB();
		try {
			rd.connectDB();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void connectDB() throws ClassNotFoundException, SQLException {
		//����Ŭ�� �����Ͽ� connection �ν��Ͻ��� ���ϴ�
		//�ڵ� �ۼ� �Ͻÿ�.
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbcURL,id,pwd);
		if (con!=null) {
			System.out.println("success");
			con.close();
		} else {
			System.out.println("fail");
		}
	}

}
