package Pattern;

public class Patternsixteen {
	public static void main(String[] atrf) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		int x = 1, k = 2*n-2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			
			k=k-1;
			
			for(int j=0;j<=i;j++) {
				System.out.print(x + " ");
			}
			
			x+=1;
			
			System.out.println();
		}
		
		k=n-2;
		x=n+1;
		
		for(int i=n;i>-1;i--) {
			for(int j=k;j>0;j--) {
				System.out.print(" ");
			}
				k=k+1;
				
				for(int j=0;j<=i;j++) {
					System.out.print(x + " ");
				}
				
				x-=1;
				
				System.out.println();
			}
		}
	}


