package constructorpackage;

public class Constructorclassfour {
	
	public void Constructorclassfour()
	{
		System.out.println("Method");
	}
	//here i maintain constructor, class and method name as same
	Constructorclassfour()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args)
	{
		new Constructorclassfour().Constructorclassfour();
	}

}
