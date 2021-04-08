package mc.sn.practice;

public class Studio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio s = new Studio();
		
		s.readyLottoBall();
	}
	
	public void readyLottoBall() {
		LottoBall[] ballBox = new LottoBall[45]; //LottoBall이라는 클래스를 담는 배열
		LottoBall ball=null; // for문이 있을 경우 선언을 밖에서 한번만 하고 안에서 담는 식
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
