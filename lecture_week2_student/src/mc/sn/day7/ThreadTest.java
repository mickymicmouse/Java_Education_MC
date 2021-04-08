package mc.sn.day7;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest tt = new ThreadTest();
		tt.test3();
	}
	
	class HisThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("inner class run method");
		}

	}
	
	public void test3() {
		YourThread you = new YourThread();
		HisThread he = new HisThread();
		Thread t = new Thread(you);
		Thread t2 = new Thread(new HisThread());
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable 익명 이너클래스");
			}
		});
		t.start();
		t2.start();
		t3.start();
	}
	
	public void test1() {
		Thread t = new Thread();
		System.out.println("before start()");
		t.start();
		System.out.println("after start()");
	}
	
	public void test2() {
		Thread t = new MyThread();
		new Thread() { //익명 이너클래스
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println((char)(i+65));
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		System.out.println("before start()");
		t.start();
		System.out.println("after start()");
	}

}
