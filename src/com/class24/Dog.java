package com.class24;

public class Dog {

	public String dogName;
	  public double dogWeight;
	  public static String dogBreed = "Mutt";
	  
	  Dog(String name, double weight, String breed){
	    dogName = name;
	    dogWeight = weight;
	    dogBreed = breed;
	    
	  }
	  
	  Dog(String name, double weight){
	    dogName = name;
	    dogWeight = weight;
	    
	  }
	  
	  public void display(){
	    
	    System.out.println(dogName + " " + dogBreed + " " + dogWeight);
	  }
	  
	}
