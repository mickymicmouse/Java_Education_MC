package mc.sn.day4;

public class ExampleClass {
	public void test1(int year) {
		
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("�����Դϴ�. 29�ϱ��� �ֽ��ϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�");
			
		}
	}
	
	public int[] testArray() {
		int[] month = new int[10];
		month[0]=5;
		
		int[] name=null;
		name = new int[]{1,2,3};
		return month;
	}
}
