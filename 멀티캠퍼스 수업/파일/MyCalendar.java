package mc.sn.day4;

public class MyCalendar {
	
	public void displayMonth(int year,int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day = 0;
		// month가 2월이면 28,29 둘 중 하나 선택
		Example e = new Example();
		//년도가 필요함
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
