package com.class19;

public class AllMethods {
	
	//create methods to return value of sum
	//sub
	//mult
	//division
	
	int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	
	int mult(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	int div(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
	
	//findLargest
	int findLargest(int num1, int num2) {
		
	int largest;
		
		if(num1 > num2) {
			largest = num1;
		}else {
			largest = num2;
		}
		
		return largest;
	}
	
	//Method will take a week day number and return a week day name
	
	String weekDayName(int weekDay) {
		String weekDayName;
		
		switch (weekDay) {
		
		case 1: 
			weekDayName = "Monday";
		break;
		
		case 2: 
			weekDayName = "Tuesday";
		break;
		
		case 3: 
			weekDayName = "Wednessday";
		break;
		
		case 4: 
			weekDayName = "Thursday";
		break;
		
		case 5: 
			weekDayName = "Friday";
		break;
		
		case 6: 
			weekDayName = "Saturday";
		break;
		
		case 7: 
			weekDayName = "Sunday";
		break;
		
		default:
			weekDayName = "Unknown";

		}
		
		return weekDayName;
	}
	
	
	//------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		
		AllMethods obj = new AllMethods();
		
		int result1 = obj.sum(5,15);
		System.out.println(result1);
		
		
		int result2 = obj.sub(5,15);
		System.out.println(result2);
		
		int result3 = obj.mult(5,15);
		System.out.println(result3);
		
		int result4 = obj.div(15,5);
		System.out.println(result4);
		
		int result5 = obj.findLargest(15,5);
		System.out.println(result5);
		
		String day = obj.weekDayName(5);
		if(day.equals("Tuesday") || day.equals("Wednessday") || day.equals("Thursday") ||
		   day.equals("Saturday") ||day.equals("Sunday")) {
			System.out.println("I'm learning Java");
		}else {
			System.out.println("I'm not learning Java today");
		}
		
		
		
		
		
		
	}
	

}	
