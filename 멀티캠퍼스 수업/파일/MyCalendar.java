package mc.sn.day4;

public class MyCalendar {
	
	public void displayMonth(int year,int month) {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		int day = 0;
		// month�� 2���̸� 28,29 �� �� �ϳ� ����
		Example e = new Example();
		//�⵵�� �ʿ���
		boolean flag = e.isLeapYear(year);
		int lastDay = 28;
		if (flag) {
			lastDay = 29;
		} 
		
		int space = 0;		
		for(int i=0;i<lastDay;i++) {
			day = i+1;
			System.out.print(day+"\t");
			if ((space+day)%7==0) {
				System.out.println();
			} 
		}
	}
}
