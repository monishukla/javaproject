package constructorpackage;

public class Constructorclassfive {
	public static void main(String[] args) {
		Constructorclassfive ccf = new Constructorclassfive(10.35);
	}
	
	Constructorclassfive(int a){
		System.out.println("First "+ a);
	}
	
	Constructorclassfive(double a){
		System.out.println("Second "+ a);
	}

}
