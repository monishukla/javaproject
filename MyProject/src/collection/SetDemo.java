package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		/*values.add(5);
		values.add(4);
		values.add(9);
		values.add(4);
		*/
		System.out.println(values.add(87));
		System.out.println(values.add(97));
		System.out.println(values.add(34));//output is not in sorted form
		System.out.println(values.add(92));
		
		for(Integer i : values) {
			System.out.println(i);
		}
		
		
	}

}
