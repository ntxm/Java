package com.class25_1;

public class Task {
	
	public int areaRectangle(int length, int width){
		int result = length * width;
		return result;
				
	}
	
	public int areaSquare(int length){
		int result = length * length;
		return result;
				
	}
	
	public int areaBox(int length, int width, int height){
		int result = length * width * height;
		return result;
				
	}

	public static void main(String[] args) {
		
		Task obj1 = new Task();
		
		
		System.out.println(obj1.areaRectangle(10, 5));
		System.out.println(obj1.areaSquare(10));
		System.out.println(obj1.areaBox(10,5,5));

	}

}
