package superkeywordpackage;

public class Supermethodtwo extends Supermethodone {
	int x = 20;
	int y = 30;
	int sum = x+y;
	
	public void Sum()
	{
		super.Sum();
		System.out.println("Sum " +  sum);
		//super.Sum();
	}
	
	/*public void display()
	{
		Sum();
		super.Sum();
	}*/
	
	public static void main(String[] a)
	{
		Supermethodtwo smt = new Supermethodtwo();
		smt.Sum();
	}

}
