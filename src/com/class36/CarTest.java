package com.class36;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.class24.Constructor;

//Create a car class that will have variables, methods and constructor
	// create a map that will  hold car number and car objects store in it

class Car {
	String make, model;
	
	public Car(String make, String model) {
		this.make = make;
		this.model = model;

	}
	
	public void display() {
		System.out.println(make + " " + model);
	}
}


public class CarTest {

	public static void main(String[] args) {
		
		Map<Integer, Car> mapCar = new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Audi", "A5"));
		mapCar.put(3, new Car("Tesla", "Model X"));
		mapCar.put(4, new Car("Mercedes", "SLC"));
		mapCar.put(5, new Car("Lexus", "RX"));
		mapCar.put(7, new Car("Honda", "Accord"));
		
		System.out.println(mapCar.size());
		
		//map keys to its corresponding values (entrySet)
		Collection <Car> coll =  mapCar.values();
		for(Car c: coll) {
			System.out.println(c.make + " -- " + c.model);
			c.display();
		}
		
		//map key to its corresponding values (EntrySet or keySet)
		
		Set<Entry<Integer, Car>> set = mapCar.entrySet();
		for(Entry<Integer, Car> ent: set) {
			Integer i = ent.getKey();
			Car c = ent.getValue();
			System.out.println("Key " + i + " is associated with value of " + c);
		}
		
		System.out.println("--- KeySet --- ");
		//using keyset to map keys to values
		Set<Integer> keySet = mapCar.keySet();
		for(int key: keySet) {
			//      Integer + map Object --> 
			//System.out.println(key+ " " + mapCar.get(key).make + " " + mapCar.get(key).model);
			
			Car car = mapCar.get(key);
			String carDetails = car.make + car.model;
			System.out.println(key + "=" + carDetails);
			
		}
		
		//use iterator to iterate through values, keySet, entrySet
		
		
		

	}

}
