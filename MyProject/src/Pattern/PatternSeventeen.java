package Pattern;

public class PatternSeventeen {
	public static void main(String[] as) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
