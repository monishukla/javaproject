package programming;

import java.util.Scanner;

public class ReverseString3 {
	public static void main(String[] args) {
		/*String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		str = in.nextLine();
		String[] token = str.split("");
		for(int i = token.length-1;i>=0;i--) {
			System.out.print(token[i]);
		}*/
		
		String str = "Manisha";
		String[] token = str.split("");
		for(int i = token.length-1;i>=0;i--) {
			System.out.print(token[i]);
		}
	}

}
