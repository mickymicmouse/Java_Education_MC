package mc.sn.practice;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceClass sc = new ServiceClass(); //�ν��Ͻ� �����ϱ�
		sc.displayMonth(); //�޼ҵ� �ҷ�����
		sc.displayGugudan(5);
		sc.selectMonth(3);
		boolean result = sc.checkPrimeNumber(4);
		System.out.println();
		if (result) {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		} else {
			System.out.println("�Ҽ��Դϴ�.");
		}
	}

}
