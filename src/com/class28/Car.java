package com.class28;

public class Car {
	
	String make;
	String model;
	
	Car(){
		System.out.println("I am non argument constructor");
	}
	
	Car(String make, String model){
		this.make = make;
		this.model = model;
		
	}
	
}

class Tesla extends Car {
	
	boolean autopilot;
	
	Tesla() {
		//super(); compiler will add by default to make a call super class
		//constructor to initialize an object
		System.out.println("I am a child non argument comstructor");
	}
	
	Tesla (String make, String model, boolean autopilot) {
		super(make, model); //constructor call
		this.autopilot = autopilot;
	}
	
	public void displayInfo() {
		System.out.println("Car " + make + " " + model + " has an autopilot " + autopilot);
	}
}
