package com.class6;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		String month;
		String season;
		
		Scanner askAge = new Scanner(System.in);
		System.out.println("Enter your month of birth");
		month = askAge.nextLine();
		
		if(month.equals("January") || month.equals("February") || month.equals("December")) {
			season = "Winter";
		}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		}else if(month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		}else {
			season = "Unknown";
		}
		System.out.println("You were born in " + season);
		System.out.println(month);
	}	

}
