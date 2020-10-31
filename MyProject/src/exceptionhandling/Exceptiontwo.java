package exceptionhandling;

public class Exceptiontwo {
	public static void main(String[] args) {
	
	int[] arr = new int[4];
	try {
		int i = arr[4];
		System.out.println("TT");
	}catch(NullPointerException e) {
		System.out.println("CC");
	}
	
	finally {
		System.out.println("FF");
	}
	
	System.out.println("oo");  // this will not execute if exception occuri

}
}	
	
