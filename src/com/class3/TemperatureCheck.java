package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		int temperature = 45;
		
		if (temperature < 32) {
			System.out.println("Water will freeze with temperature " + temperature);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temperature);
			
		}
		
		boolean isRain = true;
		if (isRain) { //isRain == true
			System.out.println("I will take an umbrella");
		} else {
			System.out.println("I will go a walk");

		}
	}

}
