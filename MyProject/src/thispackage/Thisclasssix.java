package thispackage;

public class Thisclasssix {
	int a , b;
	public static void main(String[] args) {
		Thisclasssix tcs = new Thisclasssix();
	}
	
	Thisclasssix(){
		this(10,20);
		System.out.println("Default comstructor");
	}
	
	Thisclasssix(int a, int b){
		this.a=a;
		this.b=b;
		System .out.println("Parameterized constructor " + a +" And "+ b);
	}

}
