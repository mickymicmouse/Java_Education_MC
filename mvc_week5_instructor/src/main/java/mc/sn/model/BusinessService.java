package mc.sn.model;

import java.sql.SQLException;
import java.util.ArrayList;

public class BusinessService {
	public ArrayList checkWorkingDatabase() {

		ArrayList list = new ArrayList();
		//���ۿ��θ� ���̺��� �� �� ������ ���ڿ��� ����
		JobsDAO dao = new JobsDAO();
		try {
			list = dao.selectJobs();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
