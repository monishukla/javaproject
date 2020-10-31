package exceptionhandling;

public class Exceptionthree extends Exception {
	public Exceptionthree(String string) {
		super(string);
	}
	
	Exceptionthree(){}
	
	private static int[] accno = {101,102,103};
	private static String[] name = {"Manisha","Ritvick","Pranav"};
	 private static double[] bal = {300.02,100,200};

	public static void main(String[] args) {
    
	 try {
		 int i;
		 for(i = 0;i<3;i++) {
			 System.out.println(accno[i]+"\t"+ name[i]+"\t"+bal[i]);
		}
		 
		 
		if(bal[i]<500) {
	    	 Exceptionthree me = new Exceptionthree("Less than 200");
	    	 throw me;  // this is an example of throw keyword in java
	 }
	 }catch(Exceptionthree e) {
		 e.printStackTrace();
	 }
 }

	
}