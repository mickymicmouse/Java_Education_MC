package mc.sn.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2~100���� ����ϴ� �ݺ��� �ۼ��Ѵ�. --> for�� ������ �˾ƾ� ��.
		int number = 0;
		for(int i=0;i<99;i++) {
			System.out.println(i+2);
		}
//		1~100������ ���� �ϳ��� �ö� ���� �Ҽ��� �Ǻ��ϴ� ������	
//		��ġ�� �Ѵ�. --> �Ҽ��� ���Ǹ� �˾ƾ� �Ѵ�.

//		�Ҽ��� ���Ǹ� �˰������� ��ȯ�Ѵ�.
//
		number = 5;
//		[1�� �ڱ��ڽ����θ� ����������� ��]
		int count = 0;
		for (int i=1;i<6;i++) {
			if (number % i == 0) { // ? 1~5������ ���� ��
				count ++;
			}
		}
//		������ ��ģ ���� �Ҽ������� Ȯ���Ѵ�. --> �Ҽ�Ȯ�� 
//		������ �����Ѵ�. --> if �� ������ �˾ƾ� �Ѵ�.
		int sum = 0;
		if (count==2) {
//			�ش� ���� ������ �Ҵ��ϰ� �Ҽ��� �Ҵ�� �� ���� ������Ų��.
//			--> ���� �ڵ带 �˾ƾ� �Ѵ�.
			sum  = sum + number;
		}

//		�ݺ����� ������ �ش� ������ ����Ѵ�.
//		--> �ݺ��� ������ �κ��� �˾ƾ� �Ѵ�.
		System.out.println(sum);
	}

}
