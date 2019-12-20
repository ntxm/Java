package TestRepl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class TestHS {

	public static void main(String[] args) {
	
//		TreeSet map = new TreeSet();
//		map.add("one");
//		map.add("two");
//		map.add("three");
//		map.add("four");
//		map.add("one");
////		Iterator it = map.iterator();
////		while (it.hasNext() )
////		{
////		System.out.print( it.next() + " " );
//		
//		System.out.println(map);
//		map.removeAll(map);
		
		
		Map<String, String> map = new HashMap<>();
		map.put("a", "a");
		map.put("b", "b");
		map.put("c", "c");
		
		System.out.println(map);
		map.clear();
		System.out.println(map);
		
		
		
		}

	}


