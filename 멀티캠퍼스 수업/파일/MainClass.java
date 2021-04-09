package mc.sn.day4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e = new Example();
		boolean flag = e.isLeapYear(2020);
		System.out.println(flag);
		MyCalendar mc = new MyCalendar();
		mc.displayMonth(2021,2);
		// 2021년이 아니라 사용자가 년도를 지정해서 알고 싶다.
		// 어떻게 하면 됩니까?
		
		//MyCalendar라는 서비스클래스 만드세요
	}

}
