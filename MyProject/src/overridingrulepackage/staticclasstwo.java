package overridingrulepackage;

public class staticclasstwo extends Staticclassone {
	public void method2() {
		System.out.println("method2 from child class");
	}
	
	public static void method1() {      //this method will get hide in child class and print value from parent class
		System.out.println("static method from child class");
	}
	
	void method3()
	{
		System.out.println("method3 from child class");
	}

}
