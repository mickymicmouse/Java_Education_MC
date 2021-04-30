package mc.sn.model;

import java.sql.SQLException;
import java.util.ArrayList;

public class BusinessService {
	public ArrayList checkWorkingDatabase() {

		ArrayList list = new ArrayList();
		//동작여부를 테이블의 한 행 정보를 문자열로 구성
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
