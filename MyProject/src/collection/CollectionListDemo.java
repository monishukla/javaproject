package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionListDemo {
	public static void main(String[] args) {
	List<Integer> values = new ArrayList<>();
	values.add(40);
	values.add(60);
	values.add(90);
	values.add(30);
	
	//Collections.reverse(values); //it just reverse the list
	Comparator<Integer> cmp = Collections.reverseOrder(); //decreasing order
	Collections.sort(values, cmp);
	
	for(Integer i : values) {
		System.out.println(i);
	}
	
	}	

}
