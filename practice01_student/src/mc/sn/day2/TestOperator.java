package mc.sn.day2;

public class TestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int number = 123456;
		int a = 1+1;
		
		System.out.println(number);
		System.out.println(a);
		
		System.out.println(number%10);
		System.out.println(number%100/10);
		
		int num = 532;
		System.out.println(num-num%100);
		
		double pi = 3.141592;
		int p = (int)pi; //casting
		System.out.println(p);
		
		double pi2 = p; //자동 형변환
		System.out.println(pi2);
		
		byte b1 = 1;
		byte b2 = 2;
		int b3 = b1+b2;
		System.out.println(b3);
		
		short s1 = 1;
		int s2 = s1+b1;
		System.out.println("값은 " + s2);
		*/		
		
		
		int number = 1234;
		int result = 0;
		int num = 0;
		for(int i=0; i<=3; i++) {
			num = number%10;
			number /= 10;
			System.out.println("각 자리의 값은 "+num);
			System.out.println("number의 값은 "+number);
			result += num;
			
		}
		System.out.println("합계는 "+result);
		
	}

}
