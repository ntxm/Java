package TestRepl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task208 {
	/*
	 * Create Hash Map. 
add the follow values

map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Print the values using any kind of loops you like.

OUTPUT
 
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL


	 */

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		System.out.println("HashMap Before Replace :");
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> singleIt = it.next();
			System.out.println(singleIt.getKey() + " : " + singleIt.getValue());
		}
		
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		
		System.out.println("------------------");
		System.out.println("HashMap After Replace :");
		 Set<Entry<String, String>> set = map.entrySet();
		 for(Entry<String, String> entry: set) {
			 String element = entry.getKey() + " : " + entry.getValue();
			 System.out.println(element);
		 }
		 
	}

}
