package mc.sn.day4;

public class MyCalandar {
	public boolean isLeapYear(int year) {
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			return true;
		}else {
			return false;
		}	
	}
	
	public void displayCalandar(int year) {
		int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(isLeapYear(year)==true) {
			day[1]=29;
		}
		System.out.println("\t\t\t"+year+"³â");
		int bm = 0;
		for(int i =1; i<=12; i++) {
			System.out.println();
			System.out.println("\t\t\t"+i+"¿ù");
			System.out.println();
			for(int j =1; j<=bm;j++) {
				System.out.print("\t");
			}
			for(int j =1;j<=day[i-1];j++) {
				
				if ((bm+j)%7==1) {
					System.out.println();
					System.out.println();
				}
				System.out.print(j+"\t");
				
			}
			bm = ((bm+day[i-1])%7);
			System.out.println();
		}
	}
	
	
}
