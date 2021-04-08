package mc.sn.day2;

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] day = {"월","화","수","목","금","토","일"}; 
		for(int i = 0; i<=5; i++) {
			for(int j = 1; j<=7;j++) {
				if (i==0) {
					System.out.print(day[j-1]);
					System.out.print("\t");
				} else {
					if (j==1) {
						System.out.println();
					}
					int d = (i-1)*7+j;
					if (d>31) {
						break;
					}
					System.out.print(d);
					System.out.print("\t");
				}
				System.out.print("\t");
			}
		}
		
		
	}

}
