package db_assignement2;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDTO bd1 = new BookDTO(21424 , "Java Basic", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		BookDTO bd2 = new BookDTO(33455 , "JDBC Pro", "김철수", "Jaen.kr", 23000, "");
		BookDTO bd3 = new BookDTO(55355 , "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Model2 기반");
		BookDTO bd4 = new BookDTO(35332 , "Andorid App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
		BookDTO bd5 = new BookDTO(35355 , "OOAD 분석,설계", "소나무", "Jaen.kr", 30000, "");
		BookTest bt = new BookTest();
		bt.insertStudent(bd1);
		bt.insertStudent(bd2);
		bt.insertStudent(bd3);
		bt.insertStudent(bd4);
		bt.insertStudent(bd5);
		
		bt.printAllBooks();
		
	}

}
