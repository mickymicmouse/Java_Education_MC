package mc.sn.day4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e = new Example();
		boolean flag = e.isLeapYear(2020);
		System.out.println(flag);
		MyCalendar mc = new MyCalendar();
		mc.displayMonth(2021,2);
		// 2021���� �ƴ϶� ����ڰ� �⵵�� �����ؼ� �˰� �ʹ�.
		// ��� �ϸ� �˴ϱ�?
		
		//MyCalendar��� ����Ŭ���� ���弼��
	}

}
