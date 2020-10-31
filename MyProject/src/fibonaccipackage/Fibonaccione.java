package fibonaccipackage;

public class Fibonaccione {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z;
		int count = 5;
		System.out.print(x +""+ y);
		
		for(int i=2;i<count;i++) {
			z=x+y;
			System.out.print(z);
			x=y;
			y=z;
		}
		
	}

}
