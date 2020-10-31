package overloadingpackage;

public class Overloadingclassthree {
	
	public void show(String x) {
		System.out.println(x);
	}
	
	public void show(int i) {
		System.out.println(i);
	}
	
	public void show(byte b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		byte a = 25;
		Overloadingclassthree oct = new Overloadingclassthree();
		oct.show(a);
		oct.show("hello");
		oct.show(250);
		oct.show('A');
		//oct.show(7.4);
		
	}

}
