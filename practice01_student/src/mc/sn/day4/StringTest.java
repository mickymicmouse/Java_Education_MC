package mc.sn.day4;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest st = new StringTest();
		st.test1();
		test2();
	}
	public void test1() {
		String name = "Lee";
		String addr = "서울시 노원구";
		String n = new String("L"); // "L"부분이 생성자
		System.out.println(name + ","+ addr);
		System.out.println("n="+n);
	}
	public static void test2() {
		System.out.println("static 연습입니다.");
	}
	
	public void test3() {
		
		System.out.println();
	}

}
