package typecastingpackage;

public class Typeclasstwo {
	public static void main(String[] args) {
		//Explicit downcasting
		
		long x = 10;
		int y  = (int)x;
		System.out.println(y);  // this is called downcasting
		
		float f = 4.5f;
		int n = (int)f;  //here data will lost 
		System.out.println(n);
		
		long l = 100;
		byte b = (byte)(int)l;  // here we can directly convert to byte or first convert to int then byte both are correct
		System.out.println(b);
		
		int n1 = 100;      // it is correct for downcasting not for upcasting
		long l1 = (int)n1;
		long l2 = (long)n1;
		System.out.println(l1);
		System.out.println(l2);
	}
	
}
