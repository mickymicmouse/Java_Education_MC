package mc.sn.day8;
import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestList tl = new TestList();
		tl.test1();
	}
	
	
	
	// Ŭ���� A, B �� ��Ӱ��踦 ������ �ְ� A�� ����Ŭ�����̸� 
	// ������ ���� ������ �ڵ尡 �����ϴ�.
	// A a = new B() //promotion
	// B b = (B)a // casting
	public void test1() {
		// ArrayList �� �н��մϴ�. CRUD ũ��
		// ArrayList �ν��Ͻ��� ���弼��
		ArrayList list = new ArrayList();
		list.add(new Integer(1)); //���� (�ش� ����Ʈ�� �������� ����)
		list.add(new Integer(2));
		list.add(new Integer(3));
		int size = list.size(); //ũ��
		System.out.println(size);
		this.printList(list);
		list.set(1,"20"); //����
		this.printList(list);
		list.remove(1); // ����
		this.printList(list);
		
	}
	
	//���ʸ� ���� ���� --> ������ �������� �������
	public void test2() {
		// ArrayList �� �н��մϴ�. CRUD ũ��
		// ArrayList �ν��Ͻ��� ���弼��
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(1)); //���� (�ش� ����Ʈ�� �������� ����)
		list.add(new Integer(2));
		list.add(new Integer(3));
		int size = list.size(); //ũ��
		System.out.println(size);
		this.printList(list);
		list.set(1,new Integer(20)); //����
		this.printList(list);
		list.remove(1); // ����
		this.printList(list);
		
	}
	
	public void test3() {
		// ArrayList �� �н��մϴ�. CRUD ũ��
		// ArrayList �ν��Ͻ��� ���弼��
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1); // 1�ϰ� new Integer(1)  boxing(�ڵ����� �ش� ��ü ����)
		list.add(2);
		list.add(3);
		int size = list.size(); 
		System.out.println(size);
		this.printList(list);
		list.set(1,20); 
		this.printList(list);
		list.remove(1); 
		this.printList(list);
		
	}
	//int -->Integer char -->Character
	// wrapping Ŭ���� Ȯ���ϼ��� (å)
	public void printList(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			int temp = list.get(i); //��ȸ 1 //unboxing(�ڵ����� �ش��ϴ� �⺻ Ÿ������ ����)
			System.out.println(temp);
		}
	}

}
