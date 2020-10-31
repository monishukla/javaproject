package constructorpackage;

public class Sibclasstwo {
		
		static {
			Sibclasstwo sc = new Sibclasstwo();
			sc.method1();
			System.out.println("SIB");
		}
		
		{
			System.out.println("IIB");
		}
		
		public void method1()
		{
			System.out.println("method1");
		}
		
		Sibclasstwo()
		{
			System.out.println("constructor");
		}
		
		public static void main(String[] args)
		{
			System.out.println("main method");
		}

	}



