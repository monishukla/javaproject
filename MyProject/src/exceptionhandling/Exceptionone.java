package exceptionhandling;

public class Exceptionone {
	public static int dividebyZero(int a, int b) {
		int i = a/b;
		return i;
	}
	
	public static int computeDivision(int a, int b) {
		int res = 0;
		try {
			res = dividebyZero(a,b);
			
		}catch(NumberFormatException ex) {
			System.out.println("Format is not correct");
		}
		return res;
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		try {
			computeDivision(a,b);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage() + " "+ "hvjfgfd");
		}
		
	}

}
