package mc.sn.day2;

public class RepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=50; i++) {
			int a = i/10;
			int b = i%10;
			System.out.print(i+" ");
			if (a==3 || a==6 || a==9) {
				System.out.print("¦");
			}
			if (b==3 || b==6 || b==9) {
				System.out.print("¦");
			}
			System.out.print(" ");
			
			
		}
		
	}

}
