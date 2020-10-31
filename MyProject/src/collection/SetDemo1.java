package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
	public static void main(String[] args) {
		Set<Integer> values = new TreeSet<>();
		values.add(87);
		values.add(97);
		values.add(34);
		values.add(92);
		
		/*System.out.println(values.add(87));
		System.out.println(values.add(97));
		System.out.println(values.add(34));//output is not in sorted form
		System.out.println(values.add(92));
		*/
		for(Integer i : values) {
			System.out.println(i);
		}
		
		
	}

}
