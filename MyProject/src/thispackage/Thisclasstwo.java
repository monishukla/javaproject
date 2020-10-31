package thispackage;

public class Thisclasstwo {
	int a;
	int b;
	
	public static void main(String args[])
	{
		Thisclasstwo tc2 = new Thisclasstwo();
	}
	
	Thisclasstwo()
	{
		this(10,20);
		System.out.println("default constructor");
	}
	
	Thisclasstwo(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("value of a:"+ a);
		System.out.println("value of b:"+ b);
		System.out.println("parameterized constructor");
	}

}
