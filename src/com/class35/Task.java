package com.class35;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> building = new HashMap<>();
		building.put(1, "TechnoSoft");
		building.put(2, "APR Soft");
		building.put(3, "EPAM");
		building.put(4, "EPAM");
		building.put(5, "SoftCorp");
		building.put(6, "IT World");
		building.put(6, "Google");
		building.put(7, "Shmugle");
		
		System.out.println(building);
		
		building.replace(4, "Itra");
		System.out.println(building);
		
		building.remove(7);
		System.out.println(building);

	}

}
