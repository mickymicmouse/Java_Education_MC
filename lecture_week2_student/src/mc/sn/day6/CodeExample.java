package mc.sn.day6;

import java.util.*;
public class CodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		test1(a,b);
		test2();
	}
	
	public static void test2() {
		int two = 2;
		char[] Alpha = new char[26];
		for(int i=0;i<26;i++) {
			Alpha[i]=(char)(i+65);
		}
		for(int i=1;i<26;i++) {
			if(i%3==0) {
				char Temp = Alpha[i];
				Alpha[i]=Alpha[two];
				Alpha[two]=Temp;
				two+=2;
			}
		}
		for(int i =0;i<26;i++) {
			
			System.out.print(Alpha[i]+"\t");
		}
		
	}
	
	public static void test1(int a, int b) {
		if (b<a) {
			int Temp = b;
			b = a;
			a = Temp;
		}
		for(int i=a;i<=b;i++) {
			System.out.println(i);
		}
		
	}

}
