package mc.sn.review;

public class ReviewWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1()�� ȣ���ϴ� �ڵ� �ۼ��Ͻÿ�
		ReviewWeek2 rw2 = new ReviewWeek2();
		// �Ʒ��� test1()ȣ�⿡ ���ؼ� ���� ���� ó���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		try {
			rw2.test1();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		rw2.test4();
	}
	
	public void test4() {
		//�ε��� ���� �迭�� ������ ����ϴ� �ڵ� �ۼ�
		int[] numbers = {1,2,3};
		for (int temp : numbers) {
			System.out.println(temp);
		}
		
	}
	// �����ε�
	public void test3() { }
	public void test3(int a) { }
	public void test3(String b) { }
	public void test3(int a, String b) { }
	public void test3(String b, int a) { }
	
	public void test2() {
		int x  = 10;
		System.out.println("x++ = "+x++);
		System.out.println("x = "+x);
		//19�� ������ ��µǸ� � ���� ����ұ��?
	}
	
	public void test1() throws ArrayIndexOutOfBoundsException {
		// 1. ũ�Ⱑ 0�� ������ �迭�� �����ϰ� �ʱ�ȭ�Ͻÿ�
		int[] numbers = new int[0];
		// �ڵ� ����
		// 2. ù��° ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		System.out.println(numbers[0]);
		// exception�� ���߿� ó���ϵ��� �޼ҵ带 ������ ���ÿ�.
	}

}
