package com.class37;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HW1 {

	public static void main(String[] args) {
		
		
		String[] city = {"Istanbul", "Irvine", "Venice", "Tokyo", "Niamey", "Luxembourg"};
		Map<String, Integer> cityMap = new TreeMap<>();
		
		for(String s: city) {
			cityMap.put(s, s.length());
		}
		
		//Iterator<Entry<String, Integer>> cities = cities.entrySet();
		

	}

}
