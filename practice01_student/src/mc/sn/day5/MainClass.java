package mc.sn.day5;

public class MainClass {
	//필드, 멤버 변수
	private String name;
	private static String firstName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass();
		MainClass.firstName = "kim"; // 객체의 소유주를 명시하는 것이 기본
		mc.name = "hero";
		System.out.println(mc.name);
		System.out.println(firstName);
		
	}
	int a = 3;
	public void test1() {
		name = "seungjun";
		firstName = "Lee";
	}

}
