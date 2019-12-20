package TestRepl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task204 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Street", "Patric ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");
		
		Collection<String> coll = map.values();
		for(String values: coll) {
			System.out.println(values.toUpperCase());
		}
	}

}
