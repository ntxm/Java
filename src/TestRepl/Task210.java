package TestRepl;

import java.util.HashMap;
import java.util.Map;

public class Task210 {
	/*
	 * Create HashMap 
add values as below
map.put("mango", 10); 
map.put("apple", 30); 
map.put("orange", 20); 
map.put("mango", 40); 
 map.put("mango", 40);     

Print the hash map. 
output 

{orange=20, apple=30, mango=40}
	 */

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		map.put("mango", 40); 
		map.put("mango", 40);  
		
		System.out.println(map);
	}

}
