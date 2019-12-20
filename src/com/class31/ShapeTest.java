package com.class31;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle obj = new Circle(5); 
		obj.calculateArea();
		obj.calculatePerimiter();
		
		Square obj1 = new Square(10, 5);
		obj1.calculateArea();
		obj1.calculatePerimiter();

	}

}
