package polymorphismpackage;

public class Polyclassone {
	public int Multiply(int a, int b) {
		return a*b;
	}
	
	public double Multiply(double x, double y) {
		return x*y;
	}
	
	public static void main(String[] a) {
		Polyclassone pco = new Polyclassone();
		System.out.println(pco.Multiply(5, 10));
		System.out.println(pco.Multiply(5.25, 1.12));
	}

}
