package com.class2;

public class Variables {

	public static void main(String[] args) {
		
		String name = "Tommy";
		String lastName = "Berryman";
		char grade = 'A';
		String city = "New York";
		String state = "NY";
		long phoneNumber = 8005470989l;
		boolean isAppliedBefore = false;
		
		System.out.println(name + " " + lastName);
		System.out.println(grade);
		System.out.println(city + ", " + state);
		System.out.println(phoneNumber);
		System.out.println(isAppliedBefore);
		
		city = "Boston";
		state = "MA";
		grade = 'B';
		phoneNumber = 2479003898l;
		
		System.out.println(name + " " + lastName);
		System.out.println(grade);
		System.out.println(city + ", " + state);
		System.out.println(phoneNumber);
		System.out.println(isAppliedBefore);
		
	}
}
