package mc.sn.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JobsDAO {
	//데이터베이스에 대하여 CRUD작업
	public ArrayList selectJobs() throws SQLException {
		String info = null;
		String sql = "select * from jobs";
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		ArrayList list = new ArrayList();
		while(rs.next()) {
			info = rs.getString(1)+","+rs.getString(2)+","+rs.getString(3);
			list.add(info);
		}
		rs.close();
		stmt.close();
		con.close();
		return list;
	}
}
