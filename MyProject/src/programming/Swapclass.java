package programming;

public class Swapclass {
	public static void main(String[] args) {
		int x = 10;
		int y = 30;
		
		System.out.println("Before Swapping "+ x+ " " +y);
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After Swapping "+x+" "+y);
	}

}
