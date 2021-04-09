package mc.sn.day4;

public class Example {
	public void test1(int y) {
		//윤년 체크 로직 작성
		// 윤년은 해당년도를 400으로 나누어 떨어지거나
		// 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년이다
		int year = y;
		if (year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
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







