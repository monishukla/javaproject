package programming;

import java.util.Scanner;

//This program is checking odd number

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scan.nextInt();
		
		if(num%2==0)
			System.out.println("Number is not Odd");
		else
			System.out.println("Number is Odd");
	}

}
