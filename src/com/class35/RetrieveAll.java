package com.class35;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RetrieveAll {

	public static void main(String[] args) {
		// Create a map of a person(name, lastName, address, city, state)
		Map<String, String> personMap = new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Ridrig");
		personMap.put("Address", "1525 Test Drive");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		
		System.out.println("---1st way all keys---");
		//how to retrieve the specific value?
		Set<String> keys = personMap.keySet();
		for(String key: keys) {
			System.out.println(key);
		}
		
		System.out.println("---2nd way all keys---");
		Iterator<String> keysIterator = keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		
		
		Collection<String> values = personMap.values();
		for(String val: values) {
			System.out.println(val);
		}
		
		Iterator<String> valuesIterator = values.iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}

	}

}
