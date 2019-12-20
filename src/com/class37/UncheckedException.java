package com.class37;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Beginning of the code");
		int a = 20;
		int b = 0;
		
		try {
			System.out.println(a/b); // new ArithmeticException();
		}catch(ArithmeticException e) { // ArithmeticException e = new ArithmeticException();
			
		}
		
		System.out.println("End of the code");

	}

}
