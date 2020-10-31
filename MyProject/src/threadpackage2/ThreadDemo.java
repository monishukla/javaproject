package threadpackage2;

public class ThreadDemo {
	public static void main(String[] args) {
		Hello obj1 = new Hello();  // we can write Runnable as well ad Classname because it implements Runnable interface
		Runnable obj2 = new Hii();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {  //  sometimes it prints Hello, Hi, Hi, Hello to avoid we need to add sleep
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
