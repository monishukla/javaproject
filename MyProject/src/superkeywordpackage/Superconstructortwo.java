package superkeywordpackage;

public class Superconstructortwo extends Superconstructorone{
	Superconstructortwo()
	{
		super();    // we must write super statement before in constructor
		System.out.println("Sub class");
		//super();
	}
	
	public static void main(String[] a)
	{
		Superconstructortwo sct = new Superconstructortwo();
	}

}
