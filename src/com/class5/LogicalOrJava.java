package com.class5;

public class LogicalOrJava {

	public static void main(String[] args) {
		
		String weekDay = "S";
		
		if(weekDay.equals("Tuesday") || weekDay.equals("Thursday")){
			System.out.println("SDLC Class");
		}else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java Class");
		}else if(weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No class");
		}else if(weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
		}
	}
}

