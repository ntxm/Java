package com.class17;

public class Dog {

	String breed, color, country, name;
	int age;
	double cost;
	boolean isVaccinated;
	
	
	//behavior 
	void likePlaying() {
		System.out.println("Dog " + name + " love playing with ball");
	}
	
	void  friendlyWithCats() {
		System.out.println("Dog " + name + " very friendly with cats and other dogs");
	}
	
	
	void  summary() {
		System.out.println("Dog " + name + ". Breed: " + age + ". Cost: " + cost);
	}
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.breed = "Husky";
		dog1.name = "Ars";
		dog1.color = "Black/White";
		dog1.country = "USA";
		dog1.age = 3;
		dog1.cost = 449.99;
		dog1.isVaccinated = true;
		
		
		
		Dog dog2 = new Dog();
		dog2.breed = "Bulldog";
		dog1.color = "Brown";
		dog1.name = "Forrs";
		dog2.country = "Mexico";
		dog2.age = 7;
		dog2.cost = 309.99;
		dog2.isVaccinated = true;
		
		
		
		Dog dog3 = new Dog();
		dog3.breed = "Labrador";
		dog3.name = "Ooppss";
		dog3.color = "White";
		dog3.country = "Italy";
		dog3.age = 1;
		dog3.cost = 400;
		dog3.isVaccinated = false;
		
		
		

	}

}
