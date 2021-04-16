package mc.sn.day9;

import java.util.ArrayList;

public class Studio {
	private LottoMachine machine;
	
	public Studio() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio studio = new Studio();
		try {
			studio.onAir();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onAir() throws InterruptedException {
		// ����غ��ϰ� ��Ʈ�ϰ� �̴� �ð�
		System.out.println("�ζ� ��÷ ����� �غ��մϴ�.");
		Thread.sleep(3000);
		this.readyAir();
		System.out.println("�ζ� ��÷ ����� �����մϴ�.");
		Thread.sleep(5000);
		machine.startMachineV2(6);
		Thread.sleep(3000);
		System.out.println("�̰����� ��÷ ����� ��Ĩ�ϴ�. \n�����մϴ�!");
	}
	
	public void readyAir() {
		// ���� �缭 �ζ� �ӽſ� �����ϴ� ����
		ArrayList<LottoBall> list = this.makeBalls(45);
		machine = new LottoMachine(list);
	}
	
	public ArrayList<LottoBall> makeBalls(int number){
		ArrayList<LottoBall> list = null;
		//�ζ� ���� 45�� ����� �ڵ带 �ۼ��Ͻÿ�
		list = new ArrayList<LottoBall>();
		for(int i=0;i<number;i++) {
			list.add(new LottoBall(i+1));
		}
		return list;
	}
	
	

}
