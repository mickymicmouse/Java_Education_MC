package mc.sn.service;

import java.sql.SQLException;
import java.util.ArrayList;

import mc.sn.dao.JobsDAO;

public class BusinessService {
	public String checkWorkingDatabase() {
		String line = null;
		//���ۿ��θ� ���̺��� �� �� ������ ���ڿ��� ����
		JobsDAO dao = new JobsDAO();
		try {
			line = dao.selectJobs();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
	
	public ArrayList<String> getJobs(){
		ArrayList<String> data = null;
		JobsDAO dao = new JobsDAO();
		try {
			data = dao.selectJobsAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return data;
	}
}
