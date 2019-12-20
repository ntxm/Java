package com.class35;

import java.util.HashMap;

public class MapIntro {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		//to store key + value pair into map
		
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jannie");
		
		System.out.println(map);
		//how to verify if there any elements inside map
		boolean flag = map.isEmpty();
		if(!flag) {
			int size = map.size();
			System.out.println(size);
		}
		
		//I want to replace or update the value
		map.replace(103, "Zepper");
		System.out.println(map);
		
		//remove an Object from a map
		map.remove(101);
		System.out.println(map);
		//how to verify if certain key is exist
		boolean flag1 = map.containsKey(103);
		System.out.println(flag1);
		if(flag1) {
			map.replace(103, "Seval");
		}else {
			map.put(103, "Seval");
		}
		
		
	}

}
