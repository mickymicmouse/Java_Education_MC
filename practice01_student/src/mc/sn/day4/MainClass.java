package mc.sn.day4;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ExampleClass ec = new ExampleClass();
////		ec.test1(2021);
//		
////		MyCalandar mc = new MyCalandar();
////		mc.displayCalandar(2021);
//		
//		int[] m = ec.testArray();
//		for(int i:m) {
//			System.out.println(i);
//		}
//		System.out.println(m.length);

//		ClassTest ct = new ClassTest("seungjun");
//		ct.go();
		DataClass dc1 = new DataClass("Lee","m");
		DataClass dc2 = new DataClass("Kim","f");
		//������ �����ؼ� Ŭ���� ��ü ����
		dc1.who();
		dc2.who();
		
		dc1.setName("leeseungjun");
		//dc1.setSex("m");
		//private�� �����ϰ� �Ǹ� �ҷ��� �� ����.
		System.out.println(dc1.getSex());
		System.out.println(dc1.getName());
		
		
//		dc1.name = "Park";
//		dc1.sex = "f";
		//ĸ��ȭ(private) ���ױ� ������ ���� �Ұ���
		//������ ����
		
		dc1.who();
		
	}
}
