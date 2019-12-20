package com.class35;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Recap {

	public static void main(String[] args) {
		
		Set<Double> set = new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(80.99);
		set.add(70.99);
		
		List<String> aList = new ArrayList<>();
		
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		
		/////////////////////////
		Set<String> hset = new HashSet<>();
		hset.addAll(aList);
		System.out.println(hset);
		
		aList.clear();
		System.out.println(aList);
		aList.addAll(hset);
		System.out.println(aList);
		
		Set<String> lset = new LinkedHashSet<>();
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evning");
		lset.add("Night");
		
		//convert to the ArrayList
		
		List<String> myList = new ArrayList<>();
		myList.addAll(lset);
		String element = myList.get(2);
		System.out.println(element);
		//another way to create an Objecr of ArrayList by Passing values to the const... 
		List<String> myList1 = new ArrayList<>(lset);

	}

}
