package mc.sn.day6;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass();
		mc.testpoly();


	}
	
	public void testpoly() {
		Shape sc = new Circle();
		Shape sr = new Rectangle();
		Shape st = new Triangle();

		Shape[] shapes = {sc, sr, st}; // Ŭ������ �迭�� �־ �����
		for(Shape s : shapes) {
			s.draw();
		}
		System.out.println("test �޼ҵ� �Դϴ�.");
	}

}
