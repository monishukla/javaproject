package constructorpackage;

public class SICBclassone {
	public static void main(String[] args)
	{
		SICBclassone sib = new SICBclassone();
		sib.method1();
	}
	
	public void method1()
	{
		System.out.println("Method 1");
	}
	
	{
		System.out.println("IIB");
	}
	
	static {
		System.out.println("SIB");  //sib will run before main method
	}
	
	SICBclassone()
	{
		System.out.println("constructor");
	}
	
	// sib>iib>constructor>method
	

}
