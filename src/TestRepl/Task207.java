package TestRepl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Task207 {
	
	/*
	 * Hash Map
Create a Hash Map of String pairs 
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

print the key and values pairs using loop

Remove below from Map
"ONE"
"FOUR"

Print key and values pairs using loop

OUTPUT
 
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC

	 */

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		System.out.println("HashMap Before Remove :");
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> singleIt = it.next();
			System.out.println(singleIt.getKey() + " : " + singleIt.getValue());
			
		}
		
		
		map.remove("ONE");
		map.remove("FOUR");
		
		System.out.println("------------------");
		System.out.println("HashMap After Remove :");
		Iterator<Entry<String, String>> it1 = map.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> singleIt1 = it1.next();
			System.out.println(singleIt1.getKey() + " : " + singleIt1.getValue());
			
		}
	}

}
