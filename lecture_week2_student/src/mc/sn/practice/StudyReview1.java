package mc.sn.practice;

import java.util.Scanner;

public class StudyReview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyReview1 sr = new StudyReview1();
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		sr.class1(m);
		
	}
	
	public void class1(int month) {
		int initSpace = 5;
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i<=month-2; i++) {
			initSpace+=day[i];
		}
		
		int space = initSpace%7;
		
		System.out.println("\t\t\t2021³â "+month+"¿ù");
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=1;i<=day[month-1];i++) {
			if((space+i)%7==1) {
				System.out.println();
			}
			System.out.print(i+"\t");
		}
		
		
		
	}
	
}
