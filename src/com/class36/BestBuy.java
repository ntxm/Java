package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BestBuy {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		map.put(3456, "MacBook");
		map.put(3457, "Hp Printer");
		map.put(3458, "Dell Scree");
		map.put(3459, "Samsung TV");
		map.put(3450, "Sony Camera");
		
		System.out.println(map);
		
		//to retreive key - values isng entry set
		
		Set<Entry<Integer, String>> set = map.entrySet();
		for(Entry<Integer, String> entry: set) {
			String element = entry.getKey() + "==" + entry.getValue();
			System.out.println(element);
		}
		
		System.out.println("--- Retrieving usnig iterator ---");
		Iterator<Entry<Integer, String>> entryIterator = map.entrySet().iterator();
		while(entryIterator.hasNext()) {
			Entry<Integer, String> singleEntry = entryIterator.next();
			System.out.println(singleEntry.getKey() + "==" + singleEntry.getValue());
		}
		

	}

}
