package com.class22;

public class Husky {
	
	static String breed = "Husky";
	static int paws = 4;
	static int tale = 1;
	
	String name;
	String color;
	
	void display() {
		System.out.println("Puppy name is " + name + " and it is breed is " + breed);
	}
	
	public static void main(String[] args) {
		
		Husky puppy1 = new Husky();
		Husky puppy2 = new Husky();
		
		puppy1.name = "Meatball";
		puppy1.color = "Brown";
		puppy1.display();
		
		puppy2.name = "Sharik";
		puppy2.color = "Black";
		puppy2.display();
		
		System.out.println("Changing breed");
		Husky puppy3 = new Husky();
		puppy3.name = "Sharik";
		puppy3.color = "Black";
		puppy3.breed = "Bulldog";
		puppy3.display();
		
		
		puppy1.display();
		puppy2.display();
		
	}

}
