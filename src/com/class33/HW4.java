package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW4 {

	public static void main(String[] args) {
		
		/*
		 * Create an arrayList of even numbers from 1 to 50.
		 * Using Itrerator remove any mubers that is divisible by 5 from that arrayList
		 * 
		 */
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				numbers.add(i);
			}
		}
		
		System.out.println("ArrayList created");
		System.out.println(numbers);
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			if(it.next() % 5 == 0) {
				it.remove();
			}
		}
		
		System.out.println("Digits removed");
		System.out.println(numbers);

	}

}
