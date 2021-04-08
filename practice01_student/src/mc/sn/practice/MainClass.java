package mc.sn.practice;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceClass sc = new ServiceClass(); //인스턴스 생성하기
		sc.displayMonth(); //메소드 불러오기
		sc.displayGugudan(5);
		sc.selectMonth(3);
		boolean result = sc.checkPrimeNumber(4);
		System.out.println();
		if (result) {
			System.out.println("소수가 아닙니다.");
		} else {
			System.out.println("소수입니다.");
		}
	}

}
