package abstractpackage;

public class Derivedclasstwo extends Baeclasstwo {
	
	Derivedclasstwo(){
		//super();
		System.out.println("Child class constructor");
	}
	
	public void fun() {
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println("Value of C is "+ c);
	}

}
