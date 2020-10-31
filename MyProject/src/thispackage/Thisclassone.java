package thispackage;

//current class instance variable

public class Thisclassone {
	int a;
	int b;
	
	Thisclassone(int a, int b)
	{
		this.a = a;  //thsi.a refers to global variable and a refer to local variable
		this.b = b;
	}
	
	public void display()
	{
		System.out.println("value of a:"+ a);
		System.out.println("value of b:"+ b);
	}
	
	public static void main(String args[])
	{
		Thisclassone tc1 = new Thisclassone(10,20);
		tc1.display();
	}

}
