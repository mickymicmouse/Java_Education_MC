package mc.sn.day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBasicDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBasicDB tb = new TestBasicDB();
		
		try {
			tb.selectGisaTable2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void selectGisaTable2() throws ClassNotFoundException, 
	SQLException {
		//gisaTBL테이블에 접속하여 모든 내용을 조회하여 출력하는 코드를 작성하시오
		//13시 30분까지 
		//컨넥션 취득 (메소드 이용)
		Connection con = this.getConnection();
		//쿼리 작성
		String sql = "select * from gisaTBL where localCode = ?";
		// 쿼리 요청 통로 생성
		
		PreparedStatement stmt = con.prepareStatement(sql);
		//요청에 따른 데이터 제공
		stmt.setString(1, "B");
		// 쿼리 요청 및 결과 취득
		ResultSet rs = stmt.executeQuery();
		// 결과 분석
		System.out.println("sql connected");
		while(rs.next())/*데이터 레코드로 이동(테이블의 마지막까지)*/ {
			// 해당 속성 조회(해당 호환데이터 타입으로)
			int stdNo = rs.getInt("stdNo"); //인덱스의 시작은 1부터
			String email = rs.getString("email");
			String localCode = rs.getString("localCode");
			// 조회 속성 출력
			System.out.println(stdNo+","+email+","+localCode);
		}
		//리턴 결과 종료
		rs.close();
		// 쿼리 통로 종료
		stmt.close();
		// 연결종료
		con.close();
}
	
	public void selectGisaTable() throws ClassNotFoundException, 
													SQLException {
		//gisaTBL테이블에 접속하여 모든 내용을 조회하여 출력하는 코드를 작성하시오
		//13시 30분까지 
		//컨넥션 취득 (메소드 이용)
		Connection con = this.getConnection();
		//쿼리 작성
		String sql = "select * from gisaTBL";
		// 쿼리 요청 통로 생성
		Statement stmt = con.createStatement();
		// 쿼리 요청 및 결과 취득
		ResultSet rs = stmt.executeQuery(sql);
		// 결과 분석
		while(rs.next())/*데이터 레코드로 이동(테이블의 마지막까지)*/ {
			// 해당 속성 조회(해당 호환데이터 타입으로)
			int stdNo = rs.getInt("stdNo"); //인덱스의 시작은 1부터
			String email = rs.getString("email");
			// 조회 속성 출력
			System.out.println(stdNo+","+email);
		}
		//리턴 결과 종료
		rs.close();
		// 쿼리 통로 종료
		stmt.close();
		// 연결종료
		con.close();
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		System.out.println("connected");
		Class.forName(driver);
		con = DriverManager.getConnection(jdbcURL,id,pwd);
		
		return con;
	}

}
