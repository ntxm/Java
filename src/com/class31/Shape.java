package com.class31;

/*
 * 
 * Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter . 
 * Create 2 child classes: Circle & Square that should have an implementation of area and perimeter 
 * calculation. Test your code.
 */
public interface Shape {
	
	
	public double calculateArea();
	public double calculatePerimiter();
}

class Circle implements Shape {
	
	double radius;
	double resultArea;
	double resultPerimeter;
	
	
	Circle(double radius) {
		this.radius = radius;
		
	}

	@Override
	public double calculateArea() {
		
		resultArea = radius * radius * Math.PI;
		 System.out.println("Circle area is " + resultArea);
		return resultArea;
	}

	@Override
	public double calculatePerimiter() {
		resultPerimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter: " + resultPerimeter);
		return resultPerimeter;
	}
	
	
	
}


class Square implements Shape {
	
	double length;
	double width;
	double resultArea;
	double resultPerimeter;
	
	
	Square(double length, double width) {
		this.length = length;
		this.width = width;
		
	}

	@Override
	public double calculateArea() {
		resultArea = length * width;
		System.out.println("Area: " + resultArea);
		return resultArea;
	}

	@Override
	public double calculatePerimiter() {
		resultPerimeter = 2 * (length + width);
		System.out.println("Perimeter: " + resultPerimeter);
		return resultPerimeter;
	}
	
	
	
}
