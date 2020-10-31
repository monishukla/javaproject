package Pattern;

public class PatternEighteen {
	public static void main(String[] a) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		int k = 2*n-2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			k-=1;
			
			for(int j=0;j<=i;j++) {
				System.out.print("10" + " ");
			}
			
			System.out.println();
		}
	}

}
