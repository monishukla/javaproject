package staticpackage;

public class ClassTwo {
	
	static int a = 10;
	static int b;
	
	static {    //static block
		System.out.println("Static Block");
		b=a*4;
		
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}

}
