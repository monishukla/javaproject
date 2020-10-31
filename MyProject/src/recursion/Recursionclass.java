package recursion;

public class Recursionclass {
	public static void main(String[] args) {
		int t = 3;
		printFun(t);
	}
	
	public static void printFun(int a) {
		if(a<1) {
			return;
		}else {
			System.out.println(a);
			printFun(a-1);
			System.out.println(a);
			return;
		}
	}

}
