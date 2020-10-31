package staticpackage;

public class ClassThree {
	
	public ClassThree(){
		System.out.println("Constructor");
	}
	
	static {
		System.out.println("Static block");
	}
	
	public static void method1() {
		System.out.println("static method");
	}
	
	public void method2() {
		System.out.println("Normal method");
	}
	
	public static void main(String[] args) {
		method1();
		ClassThree ct = new ClassThree();
		ct.method2();
		ClassThree ctt = new ClassThree();
		ctt.method2();
	}

}
