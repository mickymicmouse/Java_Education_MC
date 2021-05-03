package mc.sn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mc.sn.mgr.ConnectionManager;
import mc.sn.vo.LoginVO;

public class LoginDAO {
	public LoginVO checkMember(String id, String pwd) throws SQLException {
		LoginVO vo = null;
		List<LoginVO> list = new ArrayList<LoginVO>();
		String sql = "select username, birthyear from userTBL";
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			String mid = rs.getString("username");
			String mpwd = rs.getString("birthyear");
			if(id.equals(mid) && pwd.equals(mpwd)) {
				vo.setId(mid);
				vo.setPwd(mpwd);
				break;
			}
			
		}
		
		ConnectionManager.closeConnection(con, stmt, rs);
		
		
		return vo;
	}

}
