package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(414);
		values.add(196);
		values.add(265);
		values.add(510);
		
		/*Comparator<Integer> c = new Comparator<Integer>()
				{
			       public int compare(Integer i, Integer j) {
			    	   if(i%10>j%10)
			    		   return 1;  // sort the number based upon its last digit
			    	   else
			    		   return -1;
			       }
				};*/
	
				Collections.sort(values, (i,j)->i%10>j%10?1:-1); //instead of c we are using the whole logic lambda expression
				for(Integer o:values) {
					System.out.println(o);
				}
	}	
	

}
