package com.class10;

public class Arrays {

	public static void main(String[] args) {
		int a;
		a = 10;
		
		int a1 = 10;
		
		
		// first way:
		int[] b; //declare an array
		b = new int[4]; // I will be storing 4 values at this array
		
		//2 way ----> all in 1 line(declaration & initialization)
		int[] array = new int[4];
		
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access value from an array
		System.out.println(array[2]);
		
		
		
		
		// lets create an array that will store classes
		String[] classes = new String[4];
		
		classes[0]= "Java";
		classes[1]= "SDLC";
		classes[2]= "Manual Testing";
		classes[3]= "GitHub";
		
		System.out.println("Today I have " + classes[0] + " class.");
		
		
		//
		
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
		//how can cnange 1 to 100
		nums[0] = 100;
		
		//
		String[] names = new String[3];
		
		names[0] = "Diana";
		names[1] = "Seda";
		names[2] = "Jaime";
		
		System.out.println(names);

	}

	public static void sort(int[] list) {
		// TODO Auto-generated method stub
		
		
	}

	public static char[] toString(int[] list) {
		// TODO Auto-generated method stub
		return null;
	}

}
