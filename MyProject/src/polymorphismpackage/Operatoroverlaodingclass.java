package polymorphismpackage;

public class Operatoroverlaodingclass {
	
	public void operator(int x, int y) {
		int sum = x+y;
		System.out.println("Sum - "+ sum);
	}
	
	public void operator(String str1, String str2) {
		String s = str1+str2;
		System.out.println("concatenation - "+ s);
	}
	
	public static void main(String[] a) {
		Operatoroverlaodingclass ooc = new Operatoroverlaodingclass();
		ooc.operator(2,5);
		ooc.operator("Manisha", "Shukla");
	}

}
