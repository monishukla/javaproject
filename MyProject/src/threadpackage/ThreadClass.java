package threadpackage;

public class ThreadClass {
	public static void main(String[] args) {
		try {
			System.out.println("Entering into Deadlock");
			Thread.currentThread().join();
			System.out.println("Entered into Deadlock");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
