package mc.sn.day4;

public class Example {
	public void test1(int y) {
		//���� üũ ���� �ۼ�
		// ������ �ش�⵵�� 400���� ������ �������ų�
		// 4�� ������ �������� 100���� ������ �������� ������ �����̴�
		int year = y;
		if (year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
		
	}
	
	public boolean isLeapYear(int y) {
		boolean flag = false;
		int year = y;
		if (year%400==0 || (year%4==0 && year%100!=0)) {
			flag = true;
		} 
		return flag;
	}
}







