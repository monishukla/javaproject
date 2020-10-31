package interfacepackage;

public class Interfaceclassone implements Interfaceone, Interfacetwo {
	public static void main(String[] args) {
		Interfaceone io1 = new Interfaceclassone(); // we can't instantiate interface
		
		Interfaceclassone ico = new Interfaceclassone();
		ico.Add();
		//Interfaceone.display();
		Interfaceone io = new Interfaceclassone();
		io.display();
		
		System.out.println(ico.func(50,40));
		
	}
	
	public void Add() {
		int c = a+b;
		System.out.println(c);
	}
	
	public int func(int x, int y) {
		return x+y;
	}



}
