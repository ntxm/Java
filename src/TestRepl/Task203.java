package TestRepl;
/*
 * Create A hash Map of type pairs of String. 

Add below pairs 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all the values using loop and KeySet. 

Out put. 

265
22180
Patrick ST
United State
Vienna
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task203 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Street", "Patric ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");
		
		Collection<String> coll = map.values();
		for(String values: coll) {
			System.out.println(values);
		}
	}

}
