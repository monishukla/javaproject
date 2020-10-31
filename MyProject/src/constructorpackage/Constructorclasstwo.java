package constructorpackage;

public class Constructorclasstwo {
	/*Constructorclasstwo()
	{
		Constructorclasstwo cct = new Constructorclasstwo();
	}
	
	public static void main(String[] args)  program will throw error  
	{
		Constructorclasstwo cct2 = new Constructorclasstwo();
	}  because contructor will itself infinity times
	*/
	
	Constructorclasstwo()
	{
		Constructorclasstwo cct = new Constructorclasstwo(100);
		System.out.println("Contructor one");
	}
	
	Constructorclasstwo(int i)
	{
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		Constructorclasstwo cct2 = new Constructorclasstwo();
	}
	
}
