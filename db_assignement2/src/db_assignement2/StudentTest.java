package db_assignement2;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDTO bd1 = new BookDTO(21424 , "Java Basic", "���ϳ�", "Jaen.kr", 15000, "Java �⺻ ����");
		BookDTO bd2 = new BookDTO(33455 , "JDBC Pro", "��ö��", "Jaen.kr", 23000, "");
		BookDTO bd3 = new BookDTO(55355 , "Servlet/JSP", "���ڹ�", "Jaen.kr", 41000, "Model2 ���");
		BookDTO bd4 = new BookDTO(35332 , "Andorid App", "ȫ�浿", "Jaen.kr", 25000, "Lightweight Framework");
		BookDTO bd5 = new BookDTO(35355 , "OOAD �м�,����", "�ҳ���", "Jaen.kr", 30000, "");
		BookTest bt = new BookTest();
		bt.insertStudent(bd1);
		bt.insertStudent(bd2);
		bt.insertStudent(bd3);
		bt.insertStudent(bd4);
		bt.insertStudent(bd5);
		
		bt.printAllBooks();
		
	}

}
