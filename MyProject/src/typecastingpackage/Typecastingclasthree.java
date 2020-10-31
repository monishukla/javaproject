package typecastingpackage;

public class Typecastingclasthree {
	public static void main(String[] args) {
		Typecastingclasthree tct = new Typecastingclasthree();
        System.out.println(tct.test());
        System.out.println(tct.test2());
	}
	
	public int test()
	{
		int i = 10;
		return ++i;
	}
	
	public int test2()
	{
		int i = 10;
		return i++;
	} 

}
