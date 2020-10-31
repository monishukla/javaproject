package threadpackage3;

public class ThreadDemo {
	//we can see about join and synchronized
	private static int count = 0;
	
	public static synchronized void count()
	{
		count++; // synchronized is used as only one thread at a time will access the count
	}
	
	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i =0; i<100;i++) {
					count();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i =0; i<100;i++) {
					count();
				}
			}
			
		});
		;
		t1.start();
		System.out.println(t1.isAlive());
		Thread.sleep(10);
		t2.start();
		
		t1.join();
		System.out.println(t2.isAlive());
		t2.join();// in the output we should 10 but we get differnt because when t1 starts and
		//increment the value after then t2 starts mean while main thread printing the value this
		//when t1 and t2 die then main thread will start thats why we use join
		//System.out.println(t1.isAlive());
		System.out.println(count);
	}

}
