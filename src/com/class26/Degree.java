package com.class26;

public class Degree {

void getDegree(){
		System.out.println("I got degree");
	}
}


class Undergraduate extends Degree {
	@Override 
	void getDegree(){
		
		System.out.println("I am undergraduate");
	}
	
}


class Postgraduate extends Degree {
	@Override 
	void getDegree(){
		
		System.out.println("I am postraduate");
	}
	
}