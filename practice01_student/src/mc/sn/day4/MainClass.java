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
		//생성자 설정해서 클래스 객체 생성
		dc1.who();
		dc2.who();
		
		dc1.setName("leeseungjun");
		//dc1.setSex("m");
		//private로 변경하게 되면 불러올 수 없음.
		System.out.println(dc1.getSex());
		System.out.println(dc1.getName());
		
		
//		dc1.name = "Park";
//		dc1.sex = "f";
		//캡슐화(private) 시켰기 때문에 실행 불가능
		//데이터 변경
		
		dc1.who();
		
	}
}
