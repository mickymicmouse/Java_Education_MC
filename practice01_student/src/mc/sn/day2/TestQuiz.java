package mc.sn.day2;

public class TestQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234;
		int sum = 0;
		int num = 0;
		num = number%10;
		System.out.println("각 자리수는 " + num);
		sum+=num;
		number /= 10;
		
		num = number%10;
		System.out.println("각 자리수는 " + num);
		sum+=num;
		number /= 10;
		
		num = number%10;
		System.out.println("각 자리수는 " + num);
		sum+=num;
		number /= 10;
		
		num = number%10;
		System.out.println("각 자리수는 " + num);
		sum+=num;
		number /= 10;
		
		System.out.println("총 합계는 " + sum);
	}

}
