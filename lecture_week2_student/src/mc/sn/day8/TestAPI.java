package mc.sn.day8;

import java.text.SimpleDateFormat;
import java.util.*;


public class TestAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAPI ta = new TestAPI();
//		ta.testRandom();
//		ta.testMath();
//		ta.testDate();
//		ta.testSimpleDataFormat();
		ta.test1();
//		ta.test2();
		
		
	}
	
	public void test1() {
		Random r = new Random();
		int[] lottoNumbers = new int[6];
		int idx = 0;
		while(true) {
			if (idx==6) {
				break;
			}
			int number = r.nextInt(45)+1;
			boolean flag = true;
			for (int j = 0; j<idx; j++) {
				if (lottoNumbers[j]==number) {
					flag = false;
					break;
				}
			}
			if (flag==false) {
				System.out.println("�ߺ� ����");
				continue;
			}
			lottoNumbers[idx]=number;
			idx++;
		}
		this.printNumber(lottoNumbers);
	}
	

	public void test2() {
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		int idx1 = 0;
		int idx2 = 0;
		
		for(int i=0; i<5;i++) {
			Random r = new Random();
			idx1 = r.nextInt(numbers.length);
			idx2 = r.nextInt(numbers.length);
			int temp = numbers[idx1];
			numbers[idx1]=numbers[idx2];
			numbers[idx2]=temp;
		}
		this.printNumber(numbers);
	}

	public void printNumber(int[] list) {
		for(int x : list) {
			System.out.println(x);
		}
	}

	public void testRandom() {
		Random r = new Random();
		for(int i = 0; i<6; i++) {
			int rnd = r.nextInt();
			System.out.println(rnd);
		}
	}
	
	public void testMath() {
		double r = Math.random();
		System.out.println(r);
	}
	
	public void testDate() {
		String[] st = new String[6];
		Date date = new Date();
		st = date.toString().split(" ");
		System.out.println(date);
		for(String s :st) {
			System.out.println(s);
		}
	}
	
	public void testSimpleDataFormat() {
			String pattern = "yyyy/MM/dd HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String now = sdf.format(new Date());
			System.out.println(now);
		}
}
