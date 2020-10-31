package programming;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		String str = "This is is done by by Manisha";
		String[] split = str.split(" ");
		Map<String,Integer> map = new HashMap<>();
		
		for(int i = 0; i<split.length;i++) {
			if(map.containsKey(split[i])) {
				Integer count = map.get(split[i]); // here we are getting values for particular key and store in count variable
				map.put(split[i], count+1);
			}
			else {
				map.put(split[i], 1);
			}
		}
		
		System.out.println(map);
	}

}
