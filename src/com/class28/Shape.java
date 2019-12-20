package com.class28;

/*
 * Write program: Shape class has a constructor that takes the radius and has a subclass as circle class. 
 * In circle class create a method to calculate the area of circle. Test your code
 */
public class Shape {
	
	int radius;
	
	Shape(int radius){
		this.radius = radius;
	}

}

class Circle extends Shape {
	
	final double PI = 3.14;
	double result = 0;
	
	Circle(int radius){
		super(radius);
	}
	
	public void areaCircle() {
		result = PI * (radius * radius);
		System.out.println(result);
	}
}
