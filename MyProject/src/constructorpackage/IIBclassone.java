package constructorpackage;

public class IIBclassone {
	static int i;
	int j;
	IIBclassone()
	{
		System.out.println("This is Constructor");
		i = 10;
		System.out.println(i);
	}
	
	{
		System.out.println("This is IIB 1");
		j= 20;
		System.out.println(j);  //we can declare static nad non static variable both in IIB
	}
	
	{
		System.out.println("This is IIB 2");  // IIB execute first and then cnstructor
	}
	
	public static void main(String[] args)
	{
		IIBclassone ic = new IIBclassone();
	}

}
