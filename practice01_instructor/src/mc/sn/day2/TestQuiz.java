package mc.sn.day2;

public class TestQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345678;
		int sum = 0;
		
		// �� �ڸ��� �и��ϰ� �հ踦 ����ϴ� �ڵ� �ۼ�
		int splitNumber = 0;
		
		// �ݺ����� ����(�ݺ��� 4ȸ)
		for(int i=0;i<8;i++) // ��� �ݺ��ϴ��� ǥ��
		{
			splitNumber = number % 10;
			number = number / 10;
			sum = sum + splitNumber;
			//System.out.println(splitNumber);
		}
		//System.out.println(sum);
		/*
		splitNumber = number % 10;
		number = number / 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		
		splitNumber = number % 10;
		number = number / 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		
		splitNumber = number % 10;
		number = number / 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		*/
		
		// 1~10���� ���ʷ� ����ϴ� �ڵ带 for�� �̿��Ͽ�
		// �ۼ��ϰ� Ȯ���Ͻÿ�
		int sum2 =0;
		int count = 1;
		// 1~10���� �հ踦 ���Ͽ� ����Ͻÿ�
		for(int i=0;i<10;i++) { //for�� ����Ʈ�迭�ϰ� ���� ���� ���� �Ϲ���
			sum2 = sum2 + count; //����
			System.out.print(count+" ");
			count += 1;
			
		}
		//��������� ���
		System.out.println(sum2);
	}

}
