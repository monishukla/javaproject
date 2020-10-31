package thispackage;

public class Thisclassthree {
	
	int a;
	int b;
	
	public static void main(String[] args)
	{
		Thisclassthree tc3 = new Thisclassthree();
		tc3.display();
		tc3.get();
	}	
	
	Thisclassthree()
	{
		a = 10;
		b = 20;
	}
	
	Thisclassthree get()
	{
		return this;
	}
	
	public void display()
	{
		System.out.println("value of a:"+ a);
		System.out.println("value of b:"+ b);
	}

}
