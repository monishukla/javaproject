package factorial;

public class Factorial {
	public static void main(String[] a) {
		int num = 5, result;
		result = factorial(num);
		System.out.println("Factorial of 5 is "+ result);
	}
	
	public static int factorial(int n) {
		if(n!=0) {
			return n*factorial(n-1);
		}
		else
			return 1;
		
	}

}
