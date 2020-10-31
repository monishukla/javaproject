package Pattern;

public class PatternSeven {
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		int k = 2*n-2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			k=k-2;
			
			for(int j=0;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		k=-1;
		for(int i=n-1;i>-1;i--) {
			for(int j=k;j>-1;j--) {
				System.out.print(" ");
			}
			k=k+2;
			
			for(int j=0;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
