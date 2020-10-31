package overloadingpackage;

public class Overloadingclasstwo {
	public static void main(String[] args)
	{
		System.out.println("Main method");
		main("Hello"); //directly called the static method
	}
	
	public static void main(String a1)
	{
		System.out.println("overloaded method");
		Overloadingclasstwo.main("Manisha", "Shukla");  //called by classname
	}
	
	public static void main(String a1, String a2)
	{
		System.out.println("overloaded method 2");
	}

}
// we can overload main method