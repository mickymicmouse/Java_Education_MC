package mc.sn.project;

import java.util.Scanner;

public class YearCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		System.out.println("\t\t"+year+"년"+" "+month+"월");
		
		int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] d = {"일","월","화","수","목","금","토"};
		if ((year%4==0 && year%100!=0) || year%400==0) {
			m[1]=29;
		}
		
		for(int i = 1; i<=7; i++) {
			System.out.print(d[i-1]+"\t");
		}
		
		for(int i = 1; i<=m[month-1]; i++) {
			if (i%7==1) {
				System.out.println();
			}
			System.out.print(i+"\t");
		}
		
	}

}
