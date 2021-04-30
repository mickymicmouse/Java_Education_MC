package mc.sn.model;

import java.sql.SQLException;

public class BusinessService {
	
	public void GetData() {
		JobsDAO dao = new JobsDAO();
		try {
			String data = dao.selectJobs();
			System.out.println(data);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
