package primenumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	String primeNumber ="";
	
	for(int i = 1; i<= num; i++) {
		int count = 0;
		for(int num1 = i; num1>=1; num1--) {
			if(i%num1 == 0) {
				count = count+1;
			}
		}
		
		if(count == 2) {
			primeNumber = primeNumber + i+ "";
		}
	}
	
	System.out.println(primeNumber);
	
	}	

}
