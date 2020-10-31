package Pattern;

public class Patterntwenty {
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		int x= 65, k = 2*n-2;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			k=k-1;
			for(int j=0;j<=i;j++) {
				char ch=(char) (x);
				System.out.print(ch + " ");
				x+=1;
			}
			
			
			System.out.println();
		}
	}

}
