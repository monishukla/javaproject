package Pattern;

public class Patternfive {
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		int k = 2*n-2;
		for(int i=n;i>0;i--) {
			for(int j=k;j>0;j--) {
				System.out.print(" ");
			}
			
			k=k+1;
			for(int j=0;j<i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
