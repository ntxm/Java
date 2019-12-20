package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		//creating an object on parent class
		Animal animal = new Animal();
		animal.sleep();
		animal.eat();
		
		//creating an object on child class
		Cat cat = new Cat();
		cat.eat(); //from parent
		cat.meow(); //from child
		cat.sleep(); //from child
		
		
		
		//Non primitive Typecasting
		//widening
		Animal obj = new Cat();
		
		//narrowing
		
		//Cat obj2 = new Animal(); --> cannot convert from animal to Cat
		
	}

}
