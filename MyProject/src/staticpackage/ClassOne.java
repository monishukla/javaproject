package staticpackage;

public class ClassOne {
	
		
		public static String method1(String str)  // static method 
		{
			return str;
		}
		
		public String method2(String str)  // non-static method
		{
			return str;
		}
		
		public static void main(String args[])
		{
			ClassOne co = new ClassOne();
			System.out.println(co.method2("Manisha"));
			System.out.println(method1("Shukla"));  // static method call by class name
			
		}
	
	
	    // static method 
	   /* static void m1() 
	    { 
	        System.out.println("from m1"); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	          // calling m1 without creating 
	          // any object of class Test 
	           m1(); 
	    } 
	*/

	}



