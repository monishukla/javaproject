package Pattern;

public class Patterntwelve {
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==2||i+j==6||i-j==2||j-i==2) {
					System.out.print("*" + " ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
