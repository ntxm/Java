package com.class11;

import java.util.Scanner;

public class Task222 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cup quantity:");
		int cup = scan.nextInt();
		
		System.out.println("This is weekend? If YES, please enter true:");
		boolean isWeekend = scan.nextBoolean();
		
		if (cup >= 10 && cup <= 20 && isWeekend == false) {
			System.out.println("true");
		}else if(cup >= 15 && cup <= 25 && isWeekend == true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
