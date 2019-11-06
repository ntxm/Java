package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		
		//initiakize   //test condition    //increment
		for(int i=0;    i<=4;              i++) {
			System.out.println("good morning");
		}
		
		//print numbers from 1-10;
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		//print from 10 to 1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		//from 0 to 50 each step +5
		for(int i=0; i<=50; i+=5) {
			System.out.println(i);
		}

	}

}
