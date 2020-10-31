package threadpackage;

public class ThreadDemo {
	public static void main(String[] args) {
		Hello t1 = new Hello();
		Hii t2 = new Hii();
		
		t1.start();
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {    
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
	}

}
