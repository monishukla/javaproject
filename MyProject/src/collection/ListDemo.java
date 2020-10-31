package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2, 10);
		values.add("3");
		
		for(int i=0; i<values.size();i++) {
			System.out.println(values.get(i));
		}
		
		//we can use inhanced for loop also
		for(Object o:values) {
			System.out.println(o);
		}
	}

}
