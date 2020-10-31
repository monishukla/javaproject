package hierarchicalinheritance;

public class Mainclass {
	public static void main(String[] a) {
		Hierarchicalthree obj1 = new Hierarchicalthree();
		Hierarchicaltwo obj2 = new Hierarchicaltwo();
		obj1.print_first();
		obj1.print_third();
		
		obj2.print_first();
		obj2.print_second();
		
	}

}
