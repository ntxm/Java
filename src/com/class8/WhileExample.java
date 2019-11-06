package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/* ask user to enter is raining or not(true or false)
		 * as long as there is rain lets tell user to take an umbrella
		 * as soon as there is no rain --> you can go to the park
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		boolean isRain;
		
		do {
			System.out.println("It is raining?");
			isRain = scan.nextBoolean();
			
		}while(isRain);
		
			System.out.println("Go to the park");
	
	
	}
	
	
	
	

}
