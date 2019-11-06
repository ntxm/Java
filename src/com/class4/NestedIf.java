package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		boolean b = true;
		boolean classToday = true;
		
		if(b) {
			System.out.println("Hello");
			
			if(classToday) {
				System.out.println("Helo my friends");
			}
		}else {
			System.out.println("Bye");
		}
		
		//example 2
		
		boolean isFriday = true;
		int day = 13;
		
		if(isFriday) { //if true, going to this part
			System.out.println("Today is Friday");
			if(day == 13) {
				System.out.println("I will watch a scary movie");
			}else { //if day is not 13, goint to this part
				System.out.println("No worries, is not 13");
			}
		}else { // if isFriday = false, jump inside this part;
		System.out.println("Today is not Friday");
		}

	}

}
