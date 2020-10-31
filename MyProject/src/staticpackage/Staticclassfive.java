package staticpackage;

public class Staticclassfive {
	static int i;  //static variable for both static and global variable by default it will take 0 as value when variable is not initialized 
	int j;         //Global variable object creation is mandatory
	 public void method1()
	 {
		 int k = 10;   //Local Variable need to initialize the variable
		 System.out.println(k);   //We can access local variable with in a method
		 System.out.println(i);   //We can access static variable anywhere in the class
		// System.out.println(five.j);  // To access global variable we need to initialize the object within the method
		 Staticclassfive five1 = new Staticclassfive();
		 System.out.println(five1.j);     // we can't access global variable by object initialized in different method
		 
	 }
	 
	 public static void main(String[] args)
	 {
		 Staticclassfive five = new Staticclassfive();
		 System.out.println(five.j);
		 System.out.println(i);
		 five.method1();
	 }

}

