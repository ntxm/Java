package com.class33;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Create an arrayList of words.
		 * Remove every word that ends with "e".
		 * Use iterator
		 */
		
		ArrayList<String>list = new ArrayList<>();
		list.add("Cute");
		list.add("Love");
		list.add("Eat");
		list.add("Pray");
		
		System.out.println("---Before removing----");
		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("e")) {
				iterator.remove();
			}
		}
		
		System.out.println("---After removing----");
		System.out.println(list);
		

	}

}
