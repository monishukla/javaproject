package exceptionhandling;

public class Exceptionsix  {
	public static void main(String[] args) {
		try {
		int i = 6;
		int j = 0;
		int k =i/j;
		System.out.println(k);
		}catch(Exception e) {
			System.out.println("divide by zero");
		}
		
	}

}
