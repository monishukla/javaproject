package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(9);
		values.add(6);
		values.add(1);
		
		//Collections.reverse(values);
		Collections.sort(values);
		//Collections.shuffle(values);
		
		
		
		
		//we can use inhanced for loop also
		for(Integer o:values) {
			System.out.println(o);
		}
	}


}
