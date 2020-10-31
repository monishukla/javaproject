package inheritancepacckage;

public class Subclassone extends Superclassone {
	
	public void print_title()
	{
		System.out.println("Shukla");
	}
	
	public static void main(String[] args)
	{
		Subclassone sc1 = new Subclassone();
		sc1.print_name();
		sc1.print_title();
	}

}
