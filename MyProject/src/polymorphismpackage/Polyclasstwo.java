package polymorphismpackage;

public class Polyclasstwo {
	public static int Multiply(int a, int b) {
		return a*b;
	}
	
	public static int Multiply(int a, int b, int c) {
		return a*b*c;
	}
	
	public static void main(String[] a) {
		System.out.println(Polyclasstwo.Multiply(2, 4));
		System.out.println(Polyclasstwo.Multiply(3, 4, 6));
		
	}

}
