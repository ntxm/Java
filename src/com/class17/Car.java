package com.class17;

public class Car {
	//define attributes/features
	
	String make, model, color;
	int year, wheels, windows;

	//adding behavior / action --> methods()
	
	void drive() {
		System.out.println("Car " +make+  " can drive");
	}
	
	void start() {
		System.out.println("Car " +make+ " can start");
	}
}
