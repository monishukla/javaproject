package fibonaccipackage;

public class Fibonaccitwo {
	static int x = 0, y = 1, z=0;
	public static void main(String[] a) {
		int count = 5;
		System.out.print(x+""+y);
		printFibonacci(count-2);
	}
	
	public static void printFibonacci(int count) {
		if(count>0) {
			z=x+y;
			System.out.print(z);
			x=y;
			y=z;
			printFibonacci(count-1);
		}
	}

}
