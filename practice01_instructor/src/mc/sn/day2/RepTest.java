package mc.sn.day2;

public class RepTest {
	// count ������ �����ϼ���
	// 1~10���� ���ӵ� ���ڸ� ����ϴ� ���� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<10;i++) {
			
			count = count + 1;
			if (count%2==0) {
				//¦���� ���
				//System.out.print(" ¦�� "+count);
			} else {
				//System.out.print(" Ȧ�� "+count);
			}
		}
		// 1~50������ ���ӵ� ���ڸ� �̿��Ͽ� 3,6,9�϶� 
		//¦�� ����ϴ� �ڵ��ۼ��Ͻÿ�
		// 36 --> ¦¦, 3->¦ , 1 --> �ƹ��͵� ��¾���
		for(int i=1;i<51;i++) {
			int cnt = 0;
			if (i<11) {
				if (i==3) {
					cnt++;
				} else if(i==6) {
					cnt++;
				} else if(i==9) {
					cnt++;
				}
			} else {
				//���� �и� �ڵ�
				//�и��� ���� ���ϴ� �ڵ�
			}
			// cnt �� �������� ���
			if (cnt == 1) {
				System.out.println(i+" >> ¦");
			} else if(cnt == 2){
				System.out.println(i+" >> ¦¦");
			}
			
		}
		
	}

}
