package finalpackage;

public class Finalclassone {
	final static int A = 5;
	final int B;
	final int C;
	static final double D = 3.15144;
	static final double E;
	
	
	{
		B = 6;
		System.out.println(B);
	}
	
	static {
		E = 1.5456;
		System.out.println(E);
	}
	
	Finalclassone()
	{
		C = 10;
		System.out.println(C);
	}
	
	/*Finalclassone(String x)
	{
		C = 10; we have to initialize the "C" variable in every constructor.
		System.out.println(C);
	}*/
	
	public static void main(String[] a)
	{
		Finalclassone fc1 = new Finalclassone();
		System.out.println(A);
		System.out.println(D);
	}

}
