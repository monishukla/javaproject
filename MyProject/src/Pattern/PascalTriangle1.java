package Pattern;

public class PascalTriangle1 {
	public static void main(String[] args)
	{
		int row = 5;
		for(int i=1;i<row;i++) {
			int coff = 1;
			for(int j=1;j<row-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;i++) {
				System.out.print(" " + coff + " ");
				coff = coff*(i-k)/k;
			}
			System.out.println();
		}
			
	}
}
