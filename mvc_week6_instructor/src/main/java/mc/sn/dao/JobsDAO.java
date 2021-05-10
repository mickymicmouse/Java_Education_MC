package mc.sn.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mc.sn.mgr.ConnectionManager;

public class JobsDAO {
	
	public ArrayList<String> selectJobsAll() throws SQLException {
		ArrayList<String> info = new ArrayList<String>();
		String sql = "select * from jobs";
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			info.add(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
		}
		
		ConnectionManager.closeConnection(con, stmt, rs);
		
		return info;
	}
	//데이터베이스에 대하여 CRUD작업
	public String selectJobs() throws SQLException {
		String info = null;
		String sql = "select * from jobs";
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			info = rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4);
			break;
		}
		
		ConnectionManager.closeConnection(con, stmt, rs);
		
		return info;
	}
}
