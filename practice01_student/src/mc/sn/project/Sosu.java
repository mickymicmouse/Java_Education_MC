package mc.sn.project;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		for (int i = 3; i<=num; i++) {
			boolean flag = true;
			for (int j = 2; j<i; j++) {
				if (i%j==0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				sum+=i;
			}
			
		}
		System.out.print(sum);
	}

}
