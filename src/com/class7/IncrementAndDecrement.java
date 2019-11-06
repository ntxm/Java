package com.class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int time = 8;
		
		if(time < 12) { // condition is true
			System.out.println("Good morning!!"); // code executes 1 
		}
		
		
		while (time < 12) { //condition is true
			System.out.println("Good morning"); // code executes infinitely
			time++;
		}
		
		System.out.println("--------------------------------");
		//I want to print GA 5 times
		
		int i = 0;
		while(i < 5) {
			System.out.println("Good aftenon");
			i++;
		}
	}

}
