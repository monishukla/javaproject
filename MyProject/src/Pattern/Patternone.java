package Pattern;

public class Patternone {
	public static void main(String[] args) {
		Patternone po = new Patternone();
		po.pattern(5);
	}
	
	public void pattern(int n) {
		int x = 1, k=2*n-2;
		for(int i = 0;i<n;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(" ");
				
			}
			k=k-1;
			
			
			for(int j = 0; j<=i;j++) {
				System.out.print(x + " ");
			}
			x=x+1;
			System.out.println();
		}
	}

}
