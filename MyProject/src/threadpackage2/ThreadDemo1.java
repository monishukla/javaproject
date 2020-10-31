package threadpackage2;

public class ThreadDemo1 {
	//implement in one class only
	public static void main(String[] args)  {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i =1; i<=5;i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block   //this thread.sleep is for printing Hello then hii
						e.printStackTrace();
					}
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i =1; i<=5;i++) {
					System.out.println("Hii");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block   //this thread.sleep is for printing Hello then hii
						e.printStackTrace();
					}
				}
			}
			
		});
		
		t1.start();
		System.out.println(t1.isAlive());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
