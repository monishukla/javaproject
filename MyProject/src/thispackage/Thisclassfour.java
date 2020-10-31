package thispackage;

public class Thisclassfour {
	int a;  //global variable
	int b;
	
	public static void main(String[] args)
	{
		Thisclassfour tc4 = new Thisclassfour();
		tc4.get();
	}
	
	Thisclassfour(){
		a=10;
		b=20;
	}
	
	public void display(Thisclassfour tc4)
	{
		System.out.println("value of a:"+ a);
		System.out.println("value of b:"+ b);
	}
	
	public void get()
	{
		display(this);
	}
	

}
