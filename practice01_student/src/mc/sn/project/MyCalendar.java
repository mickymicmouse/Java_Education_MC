package mc.sn.project;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] day = {"일","월","화","수","목","금","토"};
		
		System.out.print("\t\t\t");
		System.out.print("8월");
		System.out.println();
		
		for (int i = 1;i<=7;i++) {
			System.out.print(day[i-1]);
			System.out.print("\t");
		}
		System.out.println();
		int space = 5;
		for (int i = 1; i<=space; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i<=31;i++) {
			System.out.print(i);
			System.out.print("\t");
			if ((space+i)%7==0) {
				System.out.println();
				System.out.println();
				
			}
		}
		
	}

}
