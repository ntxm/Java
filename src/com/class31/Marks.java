package com.class31;

/*
 * We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
 * by student A and in four subjects (each out of 100) by student B. Create class ‘Marks’ with an 
 * abstract method ‘getPercentage’. It is inherited by classes ‘A’ and ‘B’ each having a method 
 * with the same name which returns the percentage of the students. The constructor of student A takes 
 * the marks in three subjects as its parameters and the marks in four subjects as its parameters for 
 * student B. Test your code
 * 
 * 
 */
public abstract class Marks {
	
	public abstract int getPercentage();

}


class StudA extends Marks {
	
	int a;
	int b;
	int c;
	
	
	StudA(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	@Override
	public int getPercentage() {
		
		int result = (a + b + c) / 3;
		System.out.println(result);
		return result;
		
		
	}
	
}


class StudB extends Marks {
	int a;
	int b;
	int c;
	int d;
	
	
	StudB(int a, int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public int getPercentage() {
		int result = (a + b + c + d) / 4;
		System.out.println(result);
		return result;
		
	}
	
}

