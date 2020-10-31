package Pattern;

public class Patterntwentyone {
	public static void main(String[] args) {
		//int n=7;
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(j==0||(3+j)==i||(3-j)==i) {
					System.out.print(" *");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
