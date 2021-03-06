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
		//gisaTBL테이블에 접속하여 모든 내용을 조회하여 출력하는 코드를 작성하시오
		//13시 30분까지 
		//컨넥션 취득
		Connection con = this.getConnection();
		// 쿼리 요청 및 통로 생성
		Statement stmt = con.createStatement();
		// 쿼리 작성
		String sql = "select * from gisaTBL";
		// 쿼리 요청 및 결과 취득
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) /* 데이터 레코드로 이동(테이블의 마지막까지) */{
			//해당 속성 조회
			int stdNo = rs.getInt("stdNo"); //인덱스의 시작은 1부터
			String email = rs.getString("email");
			// 조회 결과 출력
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
