package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your class day:: ");
		String day = scanner.nextLine();
		
		if(day.equals("saturday")) {
			System.out.println("Saturday is your Java Class");
		}else if(day.equalsIgnoreCase("sunday")) {
			System.out.println("Sunday is your Git Class");
		}else if(day.equals("thursday")) {
			System.out.println("Thursday is your Manual Testing Class");
		}else if(day.equals("tuesday")) {
			System.out.println("Tuesday is your SDLC Class");
		}else {
			System.err.println("Wrong day");
		}
		
		scanner.close();
	}

}
