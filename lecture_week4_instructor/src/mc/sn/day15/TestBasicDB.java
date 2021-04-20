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
		//gisaTBL���̺� �����Ͽ� ��� ������ ��ȸ�Ͽ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		//13�� 30�б��� 
		//���ؼ� ��� (�޼ҵ� �̿�)
		Connection con = this.getConnection();
		//���� �ۼ�
		String sql = "select * from gisaTBL where localCode = ?";
		// ���� ��û ��� ����
		
		PreparedStatement stmt = con.prepareStatement(sql);
		//��û�� ���� ������ ����
		stmt.setString(1, "B");
		// ���� ��û �� ��� ���
		ResultSet rs = stmt.executeQuery();
		// ��� �м�
		System.out.println("sql connected");
		while(rs.next())/*������ ���ڵ�� �̵�(���̺��� ����������)*/ {
			// �ش� �Ӽ� ��ȸ(�ش� ȣȯ������ Ÿ������)
			int stdNo = rs.getInt("stdNo"); //�ε����� ������ 1����
			String email = rs.getString("email");
			String localCode = rs.getString("localCode");
			// ��ȸ �Ӽ� ���
			System.out.println(stdNo+","+email+","+localCode);
		}
		//���� ��� ����
		rs.close();
		// ���� ��� ����
		stmt.close();
		// ��������
		con.close();
}
	
	public void selectGisaTable() throws ClassNotFoundException, 
													SQLException {
		//gisaTBL���̺� �����Ͽ� ��� ������ ��ȸ�Ͽ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		//13�� 30�б��� 
		//���ؼ� ��� (�޼ҵ� �̿�)
		Connection con = this.getConnection();
		//���� �ۼ�
		String sql = "select * from gisaTBL";
		// ���� ��û ��� ����
		Statement stmt = con.createStatement();
		// ���� ��û �� ��� ���
		ResultSet rs = stmt.executeQuery(sql);
		// ��� �м�
		while(rs.next())/*������ ���ڵ�� �̵�(���̺��� ����������)*/ {
			// �ش� �Ӽ� ��ȸ(�ش� ȣȯ������ Ÿ������)
			int stdNo = rs.getInt("stdNo"); //�ε����� ������ 1����
			String email = rs.getString("email");
			// ��ȸ �Ӽ� ���
			System.out.println(stdNo+","+email);
		}
		//���� ��� ����
		rs.close();
		// ���� ��� ����
		stmt.close();
		// ��������
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
