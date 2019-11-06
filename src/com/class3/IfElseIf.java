package com.class3;

public class IfElseIf {
	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("Num1 is larger than num2");
		} else if (num1 == num2) {
			System.out.println("Num1 is  equal than num2");
		} else {
			System.out.println("Num1 is smaller than num2");
		}

		// day of week
		int day = 5;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thrusday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("I dont know this day");
		}
		//ctrl + shift + f;

	}
}
