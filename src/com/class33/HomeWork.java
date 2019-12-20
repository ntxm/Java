package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		
		/*
		 * Create an arrayList of cars and retrieve all the values using 3 different ways
		 * 
		 */
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Lexus");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Mazda");
		
		System.out.println("Array size is " + cars.size());
		System.out.println(cars);
		
		System.out.println("====WAY 1====");
		for(int i = 0; i<cars.size(); i++) {
			System.out.println("Car " + i + ": " + cars.get(i));
		}
		
		System.out.println("====WAY 2====");
		for(String car: cars) {
			System.out.println("Car: " + car);
		}
		
		System.out.println("====WAY 3====");
		Iterator<String> iterator = cars.iterator();
		while(iterator.hasNext()) {
			String carModel = iterator.next();
			System.out.println(carModel);
		}
		
	}

}
