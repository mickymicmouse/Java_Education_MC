package mc.sn.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IO는 왜 연결이 많을까요?
		TestConsole tc = new TestConsole();
//		try {
//			tc.test1();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		tc.test2();
	}
	
	public void test2() {
		//Scanner 클래스 이용 --> 인스턴스를 생성하시오
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
		System.out.println(line);
	}
	
	public void test1() throws IOException {
		//키보드로 부터 입력받기  --> chain 프로그래밍
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		br.close();
		isr.close();
		is.close();
		System.out.println(line);
	}

}
