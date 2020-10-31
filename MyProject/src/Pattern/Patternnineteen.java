package Pattern;

public class Patternnineteen {
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		int x= 65;
		for(int i=0;i<n;i++) {
			char ch=(char) (x);
			for(int j=0;j<=i;j++) {
				System.out.print(ch + " ");
			}
			x+=1;
			
			System.out.println();
		}
	}
	

}
