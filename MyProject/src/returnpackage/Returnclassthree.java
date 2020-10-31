package returnpackage;

public class Returnclassthree {
	public void method1(int i, String str)
	{
		System.out.println(i);
		System.out.println(str);
	}
	
	public static void main(String[] args)
	{
		Returnclassthree rct = new Returnclassthree();
		rct.method1(10, "Hello");
	}

// refer Classone.java for return value	


}
