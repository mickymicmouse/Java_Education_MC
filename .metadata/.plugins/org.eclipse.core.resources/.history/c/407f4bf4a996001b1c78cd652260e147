package mc.sn.day7;

public class TestException {

	public static void main(String[] args) {
		TestException te = new TestException();
//		te.test1();
//		te.test2(args);
		try {
		te.test2();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public void test1() {
		System.out.println("test1");
		int a = 0;
		try {
			int c = 10/a;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("에러 발생"+e.getMessage());
		}
		
		
	}
	
	public void test2(String[] args) {
		int size = args.length;
		for(String x: args) {
			System.out.println(x);
		}
	}
	
	public void test2() throws ArrayIndexOutOfBoundsException{
		int[] abc = new int[3];
		abc[0]=1;
		abc[1]=2;
		abc[2]=3;
		abc[3]=4;
		
	}
	
}
