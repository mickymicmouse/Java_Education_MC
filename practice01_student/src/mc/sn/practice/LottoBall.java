package mc.sn.practice;

public class LottoBall {

		private String ballNumber;
		private boolean isSelectedBall;
		
		public LottoBall(String ballNumber, boolean isSelectedBall){
			this.ballNumber = ballNumber;
			this.isSelectedBall = isSelectedBall;
		}
		public String getBallNumber() {
			return this.ballNumber;
		}
		public boolean getSelectedBall() {
			return this.isSelectedBall;
		}
//		public void setBallNumber(String ballNumber) {
//			this.ballNumber = ballNumber;
//		}
//		public void setSelectedBall(boolean isSelectedBall) {
//			this.isSelectedBall = isSelectedBall;
//		}
		
		
}
