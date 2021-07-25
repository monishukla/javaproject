package primenumber;

public class Arraysorting {
	public static void main(String[] args) {
		int[] array = new int[] {4,1,5,0,9};
	
		for(int i = 0; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				int temp = 0;
				if(array[i]>array[j]) {
				temp = array[i];
				array[i]=array[j];
				array[j] = temp;
			}
			}	
			
			System.out.println(array[i]);
		}
		
		//
	}

}
