package staticpackage;

public class Variablereference {
	static Variablereference vr;
	int i = 10;
	
	public static void main(String[] args)
	{
		//int j = 20;
		vr = new Variablereference();
		System.out.println(vr.i);	
		vr.method1();
	}
	
	public void method1()
	{
		System.out.println(vr.i); //for accessing the object in another method declare reference variable as static 
	}// static reference variable can be access anywhere in the class
}
