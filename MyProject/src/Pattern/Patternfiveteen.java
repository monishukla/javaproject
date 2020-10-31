package Pattern;

public class Patternfiveteen {
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		for(int i=0;i<n;i++) {
			int x = 1;
			for(int j=0;j<=i;j++) {
				System.out.print(x + " ");
				x=x+2;
			}
			
			System.out.println();
		}
	}

}
