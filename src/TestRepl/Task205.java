package TestRepl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Task205 {
	/*
	 * Create a LinkedHashMap of String. 
Add below pair to it . 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all keys using iterator

Street
Suite
City
Zip
Country
	 */

	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");
		
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> singleIt = it.next();
			System.out.println(singleIt.getKey());
		}
		

	}

}
