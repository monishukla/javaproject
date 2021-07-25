package primenumber;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergeTwoArrayandremoveDuplicate {
	public static void main(String[] args) {
		int[] arrayA = {4,1,5,2,4,1,8};
		int[] arrayB = {2,8,9,6,5,1,7};
		
		int[] mergedArray = new int[arrayA.length + arrayB.length];
		int i = 0, j=0,k=0;
		while(i<arrayA.length) {
			mergedArray[k] = arrayA[i];
			i++; k++;
		}
		
		while(j<arrayA.length) {
			mergedArray[k] = arrayB[j];
			j++; k++;
		}
		
		Set<Integer> setwithnoduplicate = new HashSet<>();
		for(int m = 0; m<mergedArray.length; m++) {
			setwithnoduplicate.add(mergedArray[m]);
		}
		
		int[] mergedArraynoduplicate = new int[setwithnoduplicate.size()];
		Iterator<Integer> it = setwithnoduplicate.iterator();
		int n = 0;
		
		while(it.hasNext()) {
			mergedArraynoduplicate[n] = it.next();
		}
		
		Arrays.sort(mergedArraynoduplicate);
		System.out.println(Arrays.toString(mergedArray));
		
	}

}
