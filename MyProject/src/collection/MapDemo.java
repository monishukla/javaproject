package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("firstname", "Manisha");
		map.put("lastname", "Shukla");
		map.put("profession", "QA");
		
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
			//System.out.println(key);
		}
		
		for(String key : map.keySet()) {
			//System.out.println(map.get(key));
			System.out.println(key);
		}
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
	}

}
