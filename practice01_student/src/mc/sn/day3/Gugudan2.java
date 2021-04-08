package mc.sn.day3;

public class Gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\t\t\t\t구구단");
		for(int i = 0; i<=9;i++) {
			for (int j = 2; j<=9; j++) {
				if(i==0) {
					System.out.print(j+"단"+"\t");
				} else {
				System.out.print(j+"X"+i+"="+j*i+"\t");
				
				}		
			}
			System.out.println();
			
		}
		
	}

}
