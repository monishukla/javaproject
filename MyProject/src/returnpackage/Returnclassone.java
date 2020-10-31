package returnpackage;

public class Returnclassone {
	public static void main(String[] args)
	{
		Returnclassone rc = new Returnclassone();
		System.out.print(rc.method1());
	}
	
	public float method1()
	{
		System.out.println("Hello");
		return 30.5f;
		//if we returning some value then method type should not be void
	}

}
