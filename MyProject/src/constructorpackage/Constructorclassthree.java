package constructorpackage;

public class Constructorclassthree {
	int i = 10;  //global variable and need instance to access this variable
	
	Constructorclassthree()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args)
	{
		System.out.println(new Constructorclassthree().i);
	}

}
