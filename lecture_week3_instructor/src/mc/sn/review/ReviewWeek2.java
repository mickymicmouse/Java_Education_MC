package mc.sn.review;

public class ReviewWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1()를 호출하는 코드 작성하시오
		ReviewWeek2 rw2 = new ReviewWeek2();
		// 아래의 test1()호출에 대해서 직접 예외 처리하는 코드를 작성하시오.
		try {
			rw2.test1();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		rw2.test4();
	}
	
	public void test4() {
		//인덱스 없이 배열의 내용을 출력하는 코드 작성
		int[] numbers = {1,2,3};
		for (int temp : numbers) {
			System.out.println(temp);
		}
		
	}
	// 오버로딩
	public void test3() { }
	public void test3(int a) { }
	public void test3(String b) { }
	public void test3(int a, String b) { }
	public void test3(String b, int a) { }
	
	public void test2() {
		int x  = 10;
		System.out.println("x++ = "+x++);
		System.out.println("x = "+x);
		//19번 라인이 출력되면 어떤 값을 출력할까요?
	}
	
	public void test1() throws ArrayIndexOutOfBoundsException {
		// 1. 크기가 0인 정수형 배열을 선언하고 초기화하시오
		int[] numbers = new int[0];
		// 코드 생성
		// 2. 첫번째 값을 출력하는 코드를 작성하시오
		System.out.println(numbers[0]);
		// exception을 나중에 처리하도록 메소드를 수정해 보시오.
	}

}
