package Pattern;

public class Patternten {
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		int k = n-2;
		for(int i=n;i>-1;i--) {
			for(int j=k;j>-1;j--) {
				System.out.print(" ");
			}
			
			k=k+2;
			
			for(int j=0;j<i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
