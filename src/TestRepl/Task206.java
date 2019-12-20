package TestRepl;

import java.util.Map;
import java.util.TreeMap;

public class Task206 {
	
	/*
	 * Create A TreeMap of Integer, Double
Add the below values

1  1.1
2  2.2
3  3.3
4  4.4
5  5.5

validate below and print the results 
is Contain Key 3?
is Contain Values 4.4?
is Contain  key 6?
	 */

	public static void main(String[] args) {
		
		Map<Integer, Double> map = new TreeMap<>();
		
		map.put(1, 1.1);
		map.put(2, 2.2);
		map.put(3, 3.3);
		map.put(4, 4.4);
		map.put(5, 5.5);
		
		//System.out.println(map);
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue(4.4));
		System.out.println(map.containsKey(6));
		

	}

}
