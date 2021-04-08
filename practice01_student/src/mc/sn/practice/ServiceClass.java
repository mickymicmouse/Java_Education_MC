package mc.sn.practice;

public class ServiceClass {
	public void displayMonth() {
		
		int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
		int bm = 0;
		for(int i =1; i<=12; i++) {
			System.out.println();
			System.out.println("\t\t\t"+i+"��");
			System.out.println();
			for(int j =1; j<=bm;j++) {
				System.out.print("\t");
			}
			for(int j =1;j<=day[i-1];j++) {
				
				if ((bm+j)%7==1) {
					System.out.println();
					System.out.println();
				}
				System.out.print(j+"\t");
				
			}
			bm = ((bm+day[i-1])%7);
			System.out.println();
		}
	}
	
	public void displayGugudan(int temp) {
		for(int i=1; i<=9;i++) {
			for(int j=2;j<=temp;j++) {
				System.out.print(j+"X"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	
	public void selectMonth(int m) {
		int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println();
		System.out.println("\t\t\t"+m+"��");
		for (int i=1;i<=day[m-1];i++) {
			if(i%7==1) {
				System.out.println();
				System.out.println();
			}
			System.out.print(i+"\t");
		}
	}
	
	public boolean checkPrimeNumber(int n) {
		for (int i = 2; i<n; i++) {
			if (n%i==0) {
				return true;	
			}
		}
		return false;
	}
	
	
}
