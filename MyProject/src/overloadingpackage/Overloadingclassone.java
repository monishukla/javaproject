package overloadingpackage;

public class Overloadingclassone {
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public float sum(float f1, float f2)
	{
		return f1+f2;
	}
	
	public double sum(double d1, double d2)
	{
		return d1+d2;
	}
	
	public static void main(String[] args)
	{
		Overloadingclassone oc1 = new Overloadingclassone();
		System.out.println(oc1.sum(10.25, 10.75));
		System.out.println(oc1.sum(4.2, 5.5));
		System.out.println(oc1.sum(10, 77));
		
	}

}
