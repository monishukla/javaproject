package multipleinheritance;

public class Mainclass implements Three {

	
	public void print_first() {
		System.out.println("Manisha");
		
	}

	@Override
	public void print_second() {
		System.out.println("Shukla");
		
	}

	@Override
	public void print_third() {
		System.out.println("Moni");
		
	}
	
	public static void main(String[] a) {
		Mainclass main = new Mainclass();
		main.print_first();
		main.print_second();
		main.print_third();
	}

}
