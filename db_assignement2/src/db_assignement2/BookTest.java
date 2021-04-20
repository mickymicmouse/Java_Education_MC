package db_assignement2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookTest {
	
	public void insertStudent(BookDTO book) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = this.getConnection();
			String sql = "insert into bookTBL values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setString(4, book.getPublisher());
			pstmt.setInt(5, book.getPrice());
			pstmt.setString(6, book.getDesc());
			int affectedCount = pstmt.executeUpdate();
			
//			if(affectedCount>0) {
//				System.out.println("입력완료");
//			} else {
//				System.out.println("입력실패");
//			}
			
			pstmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printAllBooks() {
		Connection con = null;
		PreparedStatement pstmt = null;
		String value = "";
		try {
			con = this.getConnection();
			String sql = "select * from bookTBL";
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("*******************도서 목록*******************");
			while(rs.next()){
				String desc = rs.getString("description");
				if (desc==null){
					value = rs.getInt("isbn") + "\t | " +rs.getString("title") + "\t | " + rs.getString("author") + "\t | "+ rs.getString("publisher") + "\t | "+ rs.getInt("price") + "\t |";
				}else {
					value = rs.getInt("isbn") + "\t | " +rs.getString("title") + "\t | " + rs.getString("author") + "\t | "+ rs.getString("publisher") + "\t | "+ rs.getInt("price") + "\t | "+ desc;
				}
				System.out.println(value);
			}
		
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
