package typecastingpackage;

public class Typeclassone {
	public static void main(String[] args)
	{
		short x = 2;
		int y = x;
		System.out.println(y); 
		/* Here it is auto upcasting 
		 * means short having memory size 2 and
		 * here we store short value in int and
		 * int having memory size of 4
		 * Thats why no error*/ 
		
		float z = 3.5f;  //for float we need to add f otherwise it will throw an error
		System.out.println(z);
		
		double a = 4.55;    // but for double we directly assign the value
		System.out.println(a);
		
		/*long j = 10;
		int k = j; here it will not convert the long value to int
		System.out.println(k);*/
		
		/*float j = 4.4f;
		long x = j;   it will not convert decimal value to integer value
		System.out.println(x);
		*/
		
		
		
	}

}
