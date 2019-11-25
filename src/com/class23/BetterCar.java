package com.class23;

public class BetterCar {
	
	/* we want to build Toyota cars that will have different models and colors
	 * 
	 */

	
	static String make; // belong to the class
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	BetterCar(String carModel, String carColor, int carSpeed, int carDoors){
		model = carModel;
		color = carColor;
		speed = carSpeed;
		doors = carDoors;
	}
	
	public static void main(String[] args) {
		make = "BMW";
		//compiler will give an error, we have to pass values when we build a object
		//those values will be passed as argument to the constructor
		//through constructor instance variable will get initizalized
		BetterCar bcar1 = new BetterCar("X5", "Black", 220, 4);
		bcar1.getDetails();
		
	}
	
	
	
	public void getDetails() {
		System.out.println("I build " + make + " " + model + " " + color);
		System.out.println("My car can have speed up to " + speed + " " + doors + " doors");
	}
}
