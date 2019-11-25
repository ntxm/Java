package com.class24;

public class Car {
	
	/*1. Complete the Car.java class:
 	*Create the following variable (Choose proper datatype)
 	* make
 	* model
	* numberOfDoors
	* topSpeed
	* price
	* following the proper naming convention for variables. 
	*
	* Write four constructors:
	* The first constructor(with all parameters)
	* A secondary constructor Have all parameters except numberOfDoors. (numberOfDoors value should assign to 4 inside constructor)
	* A third constructor Have all parameters except make and model . (make and model value should assign to "unknown" inside constructor) 
	* A fourth constructor Have all parameters except topSpeed and price;(topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)  
	*
	*Create a display method in Cars class to print the class variable value in console. 
	*
	*2. Test your code with the Main.java class:
	*Create several Car objects using all Constructors. 
	*then call display method with each object.
 	*/
	
	  public String make;
	  public String model;
	  public int numberOfDoors;
	  public int topSpeed;
	  public double price;
	  
	  
	  //1st constructor 
	  Car(String make, String model, int numberOfDoors, int topSpeed, double price){
		  this.make = make;
		  this.model = model;
		  this.numberOfDoors = numberOfDoors;
		  this.topSpeed = topSpeed;
		  this.price = price;
	  }
	  
	  //2nd constructor
	  Car(String make, String model, int topSpeed, double price){
		  this.make = make;
		  this.model = model;
		  this.topSpeed = topSpeed;
		  this.price = price;
		  
		  this.numberOfDoors = 4;
	  }
	  
	  //3rd constructor
	  Car(int numberOfDoors, int topSpeed, double price){
		  
		  this.numberOfDoors = numberOfDoors;
		  this.topSpeed = topSpeed;
		  this.price = price;
		  
		  this.make = "unknown"; 
		  this.model = "unknown";
	  }
	  
	  //4th constructor
	  
	  Car(String make, String model, int numberOfDoors){
		  this.make = make;
		  this.model = model;
		  this.numberOfDoors = numberOfDoors;
		  this.topSpeed = 90;
		  this.price = 0;
	  }
	  
	  public void display() {
		  System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	  }

}
