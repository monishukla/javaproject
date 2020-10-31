package programming;

public class NumberArray {
	public static void main(String[] args) {
		int[] arr = {40,50,10,55,48,102,67,201};
		int Lar = 0;
		int SecLar = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>Lar) {
				SecLar = Lar;
				Lar = arr[i];
			}else if(arr[i]>SecLar){
				SecLar = arr[i];
			}
		}
		
		System.out.println("Largest numer: "+ Lar +" Secong Largest number: "+ SecLar);
	}

	

}
