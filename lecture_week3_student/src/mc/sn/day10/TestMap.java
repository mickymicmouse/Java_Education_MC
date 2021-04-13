package mc.sn.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMap tm = new TestMap();
		tm.test3();
	}
	
	public void printAll(HashMap<String,Integer> map) {
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println("("+key+","+value+")");
		}
	}
	
	public void test3() {
		//HashMap --> 인스턴스 만드세요
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", 1); // 1, new Integer(1) boxing
		map.put("two", 2);
		map.put("three", 3);
		int size = map.size();
		System.out.println(size);
		int r = map.get("one"); // unboxing

		System.out.println(r);
		map.put("two", 20);
		int r2 = map.get("two");
		System.out.println(r2);
		map.remove("two");
		size = map.size();
		System.out.println("size is "+size);
//		r2 = map.get("two");
//		System.out.println("after remove r2 value is "+r2);
		this.printAll(map);
	
	}
	
	public void test2() {
		//HashMap --> 인스턴스 만드세요
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", new Integer(1)); 
		map.put("two", new Integer(2));
		map.put("three", new Integer(3));
		//map.put("four", "4"); //에러
		int size = map.size();
		System.out.println(size);
		Integer i1 = map.get("one");
		int r = i1.intValue();
		System.out.println(r);
		map.put("two", new Integer(20));
		Integer i2 = map.get("two");
		int r2 = i2.intValue();
		System.out.println(r2);
		map.remove("two");
		size = map.size();
		System.out.println("size is "+size);
		i2 = map.get("two");
		r2 = i2.intValue();
		System.out.println("after remove r2 value is "+r2);
		
	}
	
	public void test1() {
		//HashMap --> 인스턴스 만드세요
		HashMap map = new HashMap();
		map.put("one", new Integer(1));
		map.put("two", new Integer(2));
		map.put("three", new Integer(3));
		map.put("four", "4");
		int size = map.size();
		System.out.println(size);
		Integer i1 = (Integer)map.get("one");
		int r = i1.intValue();
		System.out.println(r);
		map.put("two", new Integer(20));
		Integer i2 = (Integer)map.get("two");
		int r2 = i2.intValue();
		System.out.println(r2);
		map.remove("two");
		size = map.size();
		System.out.println("size is "+size);
		i2 = (Integer)map.get("two");
		r2 = i2.intValue();
		System.out.println("after remove r2 value is "+r2);
		
	}

}
