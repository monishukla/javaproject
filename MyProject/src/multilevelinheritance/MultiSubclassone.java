package multilevelinheritance;

public class MultiSubclassone extends muliintermediateclassone {
	public void print_third() {
		System.out.println("Moni");
	}
	
	public static void main(String[] arg) {
		MultiSubclassone mso = new MultiSubclassone();
		mso.print_first();
		mso.print_second();
		mso.print_third();
	}

}
