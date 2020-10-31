package constructorpackage;

public class Constructorclasssix {
	int i = 10;
	Constructorclasssix(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println(new Constructorclasssix().i);
	}

}
