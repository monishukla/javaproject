package polymorplhismpackagetwo;

public class Bank_XYZ extends Bank {
	public int getInterest() {
		return 10;
		
	}
	
	public static void main(String[] a) {
		Bank b1 = new Bank_ABC();
		Bank b2 = new Bank_XYZ();
		
		System.out.println(b1.getInterest());
		System.out.println(b2.getInterest());
	}

}
