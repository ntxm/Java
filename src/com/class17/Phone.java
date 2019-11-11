package com.class17;

public class Phone {
	
	String brand, OS, model;
	int year, version, memory;
	boolean isLatest;
	
	//methods
	
	void generateKeys() {
		System.out.println("Phone " + brand + " " + model  + " genetare keys");
	}
	
	void useFaceId() {
		System.out.println("Phone " + brand + " " + model  + " using the face ID");
	}

	
	
	
	///////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		//1st object
		Phone phone1 = new Phone();
		
		phone1.brand = "iPhone";
		phone1.model = "11S";
		phone1.OS = "11.3.13";
		phone1.memory = 256;
		phone1.year = 2019;
		phone1.isLatest = true;
		
		phone1.generateKeys();
		phone1.useFaceId();
		
		//2nd object
		Phone phone2 = new Phone();
		
		phone2.brand = "Google";
		phone2.model = "Pixel 4";
		phone2.OS = "unknown";
		phone2.memory = 128;
		phone2.year = 2019;
		phone2.isLatest = true;
		
		phone2.generateKeys();
		phone2.useFaceId();
		
		
		//3rd object
				Phone phone3 = new Phone();
				
				phone3.brand = "Nokia";
				phone3.model = "3310";
				phone3.OS = "Series 20";
				phone3.memory = 1;
				phone3.year = 2000;
				phone3.isLatest = false;
				
				
	}

}
