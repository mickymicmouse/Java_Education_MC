package mc.sn.practice;

public class Studio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio s = new Studio();
		
		s.readyLottoBall();
	}
	
	public void readyLottoBall() {
		LottoBall[] ballBox = new LottoBall[45]; //LottoBall�̶�� Ŭ������ ��� �迭
		LottoBall ball=null; // for���� ���� ��� ������ �ۿ��� �ѹ��� �ϰ� �ȿ��� ��� ��
		for(int i=1; i<=45;i++) {
			ball = new LottoBall(i+"", true);
			ballBox[i-1]=ball;
		}
		this.printBall(ballBox);
	}
	public void printBall(LottoBall[] balls) {
		for(LottoBall ball:balls) {
			System.out.println(ball.getBallNumber());
		
		}
	}
//		if (ball.getSelectedBall()) {
//			String n = ball.getBallNumber();
//			System.out.println(n);
//		}
		
		
			
	

}
