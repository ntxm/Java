package com.class28;
/*
 * Write program: userClass  that has a constructor that initializes name and mobile number 
 * istance variables. Create a subclass  userInfo that will have user address variable and 
 * it also being initialized through constructor call. Print users name, mobile number and 
 * address in userDetails method. Test your code.
 */

public class UserClass {
	
	String name;
	long phoneNumber;
	
	UserClass(String name, long phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

}

class UserInfo extends UserClass {
	
	String address;
	
	UserInfo(String name, long phoneNumber, String address){
		super(name, phoneNumber);
		this.address = address;
		
	}
	
	public void print() {
		System.out.println(name + ", " + address + ", " + phoneNumber);
	}
}
