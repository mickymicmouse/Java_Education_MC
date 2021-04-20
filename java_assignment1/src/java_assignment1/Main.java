package java_assignment1;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDTO bd1 = new BookDTO(21424 , "Java Basic", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		BookDTO bd2 = new BookDTO(33455 , "JDBC Pro", "김철수", "Jaen.kr", 23000, "");
		BookDTO bd3 = new BookDTO(55355 , "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Model2 기반");
		BookDTO bd4 = new BookDTO(35332 , "Andorid App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
		BookDTO bd5 = new BookDTO(35355 , "OOAD 분석,설계", "소나무", "Jaen.kr", 30000, "");
		System.out.println("*******************도서 목록*******************");
		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println(bd3);
		System.out.println(bd4);
		System.out.println(bd5);
		
	}
	
	

}
