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
		
		// 접속 요소
		String jdbcuri = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		// 드라이버 로딩 (접속 프로토콜 정의해둔 것)
		Class.forName(driver);
		// 커넥션 만들기
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
		// id가 2번인 userName을 lee로 변경하는 쿼리를 작성하시오.
		sql = "UPDATE testTBL2 SET userName='lee' WHERE id = 2";
		// userName 이 kim인 자료를 모두 삭제하는 쿼리를 작성하시오.
		sql = "DELETE FROM testTBL2 where userName = 'kim'";
		sql = "CREATE TABLE testTBL3 "
				+ "(id NUMBER PRIMARY KEY, username VARCHAR2, age NUMBER) ";
		// 쿼리를 보내는 통로 생성
		// connection 으로 부터 DB정보를 얻어오기 때문에 new가 사용되지 않음.
		System.out.println(sql);
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


	
	
	
	

}
