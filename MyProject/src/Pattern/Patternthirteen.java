package Pattern;

public class Patternthirteen {
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		int x=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(x + " ");
				//x+=1;
			}
			x+=1;
			System.out.println();
		}
	}

}
