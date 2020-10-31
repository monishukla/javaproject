package interfacepackage;

public interface Interfaceone {
	final int a = 10;
	final int b= 20;
	
	public void Add();
	public default void display() {  //static or display because we can't instantiate an interface
		System.out.println("Hello");
	}

}
