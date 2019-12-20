package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		// create an ArrayList to store numbers
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000); // index = 3, size = 4
		
		
		int size = numbers.size();
		System.out.println(size);
		
		//add more
		numbers.add(10000);
		
		//remove
		numbers.remove(size-1);
		numbers.remove(1);
		
		System.out.println(numbers);
		
		//retrive value from an arrayList
		
		int element = numbers.get(0);
		System.out.println(element);
		
		//1. for loop
		System.out.println("---for loop---");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		//2. advanced loop
		System.out.println("---Advanced loop---");
		for(Integer num: numbers) {
			System.out.println(num);
		}
		
		//I want to get values backward
		System.out.println("---Values backward---");
		for(int i = numbers.size()-1; i >= 0; i--) {
			System.out.println(numbers.get(i));
		}
		
		
		//3. using Iterator
		System.out.println("---Using Iterator---");
		Iterator<Integer>iterator = numbers.iterator();
		
		while(iterator.hasNext()) {
			int number = iterator.next(); //autounboxing
			if(number % 2 == 0) {
				System.out.println(number);
			}
		}

	}

}
