package com.test;

public class T0331_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t"+"2021년 8월");
		String[] day = {"일","월","화","수","목","금","토"};
		for(int i = 1; i<=7; i++) {
			System.out.print(day[i-1]+"\t");
		}
		
		for(int i = 1; i<=31; i++) {
			if (i%7==1) {
				System.out.println();
				System.out.println();
			}
			System.out.print(i+"\t");
		}
		
		
	}

}
