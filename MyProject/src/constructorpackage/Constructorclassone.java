package constructorpackage;

public class Constructorclassone {
	
	public static void main(String[] args)
	{
		Constructorclassone cc1 = new Constructorclassone();
		Constructorclassone cc2 = new Constructorclassone(100);
		Constructorclassone cc3 = new Constructorclassone("Hello",10);
	}
	
	Constructorclassone()
	{
		int i = 20;
		System.out.println(i);
	}
	
	Constructorclassone(int j){
		System.out.println(j);
	}
	
	Constructorclassone(String x, int k){
		System.out.println(x +" "+ k);
	}

}
