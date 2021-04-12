package mc.sn.day8;

public class ReviewWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewWeek2 rw2 = new ReviewWeek2();
		try {
		rw2.test1();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		}
		
		rw2.test4();
	}
	
	// 향상된 for문
	public void test4() {
		int[] numbers = {1,2,3};
		for(int i:numbers) {
			System.out.println(i);
		}
	}
	
	
	// 순서
	public void test2() {
		int x = 10;
		System.out.println(x++);
		
	}
	
	public void test1() throws ArrayIndexOutOfBoundsException {
		int[] a = new int[0];
		
		System.out.println(a[0]);
		
		
	}
}
