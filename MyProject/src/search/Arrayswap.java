package search;

import java.util.Arrays;

public class Arrayswap {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int k = 1;
		//output = 6,1,2,3,4,5
		int l = arr.length-2;
		int[] anoarray = new int[arr.length];
		int[] arr1 = new int[arr.length-1];
		for(int i = 1;i<=k;i++)
		{ 
			int j =0; int m =0;int n= 0;
			while(j<arr.length-1) {
				if(j == l) {
					arr1[n] = arr[j];
					n++;j++;
				}
				anoarray[m] = arr[j];
				j++;m++;
			}
		
		}
		System.out.println(Arrays.toString(anoarray));
		System.out.println(Arrays.toString(arr1));
		
		int[] c = new int[arr1.length + anoarray.length];
		int v=0;int u=0; int w=0;
		while(v<arr1.length)
		{
			c[w] = arr1[v];
			v++; w++;
		}
		
		while(v<arr1.length)
		{
			c[w] = arr1[u];
			w++; u++;
		}
		
		System.out.println(Arrays.toString(c));
		
		
		/*System.arraycopy(arr1, 0, c, 0, arr1.length);
		System.arraycopy(anoarray, 0, c, 0, anoarray.length);

		;*/
	}

}
