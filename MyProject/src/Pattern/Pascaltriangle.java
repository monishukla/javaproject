package Pattern;

public class Pascaltriangle {
	public static void main(String[] args)
	{
		int row = 5;
		for(int i=1;i<row;i++) {
			int coff = 1;
			for(int k=1;k<=i;k++) {
				System.out.print(coff + " ");
				coff = coff*(i-k)/k;
			}
			
			System.out.println();
		}
	}
}
