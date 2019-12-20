package TestRepl;

import java.util.HashMap;
import java.util.Map;

public class Task202d {
	/*
	 * Create a HashMap of String. 
Add below pair to it . 

"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Find the size of keys . and print the size. 
Clear the Map.
Find the size again and print the size
Output
5
0
	 */

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Street", "Patric ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");
		
		System.out.println(map.keySet().size());
		
		map.clear();
		
		System.out.println(map.keySet().size());
	}

}
