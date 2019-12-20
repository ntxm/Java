package com.class34;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<>();
		
		//storing values into hashset
		
		hset.add("cucumber");
		hset.add("onion");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("pepper");

		System.out.println(hset.size());
		System.out.println(hset);
		
		//they do not have any methods to retrieve elements from the collection
		//.get(); .set();
		
	}

}
