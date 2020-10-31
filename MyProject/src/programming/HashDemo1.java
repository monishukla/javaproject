package programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashDemo1 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("firstname", "Manisha");
		map.put("lastname", "Shukla");
		map.put("profession", "QA");
		
		Iterator it =map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> me = (Entry<String, String>) it.next();
			System.out.println("Key is "+ me.getKey() +" Value is " + me.getValue());
		}
		
	}		

}
