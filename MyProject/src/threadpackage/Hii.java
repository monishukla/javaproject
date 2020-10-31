package threadpackage;

public class Hii extends Thread {
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

}
