package abstractpackage;

public class Derivedclassthree extends Baseclassthree {
	public static void main(String[] args) {
		Derivedclassthree dct = new Derivedclassthree();
		dct.display();
		System.out.println(dct.a);
	}
	

	@Override
	public void display() {
		System.out.println("display");
		
	}

}
