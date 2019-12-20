package com.class34;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		Set<Sweets> sweetSet = new HashSet<>();
		
		Sweets sweet = new Sweets("Cake");
		sweetSet.add(sweet);
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("Ice Cream"));
		sweetSet.add(new Sweets("Baklava"));
		sweetSet.add(new Sweets("Chocolate"));
		
		
		System.out.println(sweetSet.size());
		//how do we print name of each sweet?
		System.out.println("---1 way----");
		for(Sweets element: sweetSet) {
			System.out.println(element);
		}
		
//		System.out.println("---2 way----");
//		Iterator<Sweets> it = sweetSet.iterator();
//		while(it.hasNext()) {
//			System.out.println();
//		}
		

	}

}
