package superkeywordpackage;

public class Variabletwo extends Variableclassone {
	int maxspeed = 180;
	
	public void display() {
		System.out.println("Maximum speed"+ maxspeed);
		System.out.println("Maximum speed"+ super.maxspeed);
	}
	
	public static void main(String[] args) {
		Variabletwo vt = new Variabletwo();
		vt.display();
	}

}
