package com.class25_1;

public class ConstructorOverloading {
	//different amount of parameters
	ConstructorOverloading(){
		System.out.println("I am non-argument constructor");
	}
	
	ConstructorOverloading(String str){
		System.out.println("I am argument constructor");
	}
	
	//having different type of parameters
	ConstructorOverloading(int num){
		System.out.println("I am argument constructor");
	}
}
