package returnpackage;

public class Returnclasstwo {
	public static void test(int i) // here value 10 is copied and get print.
	{
		System.out.println(i);
	}
	
	public static void main(String[]args)
	{
		test(10);// we can with classname or without classname
	}

}
