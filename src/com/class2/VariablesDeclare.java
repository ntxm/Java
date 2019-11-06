package com.class2;

public class VariablesDeclare {

	public static void main(String[] args) {
		
		//Declaring variable and assign
		int num1 = 1;
		int num2 = 5;
		int num3 = 600;
		
		//declare var first and then assign the value
		int num4;
		int num5;
		int num6;
		
		num4 = 10;
		num5 = 20;
		num6 = 40;
		
		//declare all together, then assign the value
		int num7, num8, num9;
		
		num7 = 50;
		num8 = 90;
		num9 = 200;
		num7 = num8;
		System.out.println(num7);
		
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain;
		System.out.println(isSnow);
			
	}
}
