package com.class25_1;

public class Task2 {
	
	public static void Task() {
		System.out.println("I am method without arguments");
	}
	
	public static void Task(String name, int age) {
		System.out.println("My name is " + name + " and I am " + age + " years old");
		
		if(age >= 30) {
			System.out.println("I am tired to being adult :D ");
		}else if(age < 30) {
			System.out.println("I am young!");
		}else {
			System.out.println("unknown");
		}
	}
	
	public static void Task(String name, String age) {
		System.out.println("My name is " + name + " and I am " + age);
		
	}
	
	public static void main(String[] args) {
		Task2 man = new Task2();
		
		man.Task("William", 32);
		man.Task("John", "40 y.o.");
	}

}
