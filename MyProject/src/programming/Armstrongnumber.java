package programming;

public class Armstrongnumber {
	public static void main(String[] args) {
		int a,num = 153;
		int temp, c = 0;
		temp = num;
		while(num>0) {
			a = num%10;
			num = num/10;
			c = c+(a*a*a);
		}
		if(temp==c) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}

}
