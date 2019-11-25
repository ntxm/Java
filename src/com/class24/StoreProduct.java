package com.class24;

public class StoreProduct {
	
	  public String label;
	  public double price;
	  public String category;
	  public boolean hasExpiration;
	  public int stock;
	  
	  
	  //1st
	  StoreProduct(String label, double price, String category, boolean hasExpiration, int stock){
		  this.label = label;
		  this.price = price;
		  this.category = category;
		  this.hasExpiration = hasExpiration;
		  this.stock = stock;
	  }
	  
	  //2nd
	  StoreProduct(String label, double price, int stock){
		  this.label = label;
		  this.price = price;
		  this.category = "misc";
		  this.hasExpiration = false;
		  this.stock = stock;
		  
		  
	  }
	  
	  //3rd
	  StoreProduct(String label, double price){
		  this.label = label;
		  this.price = price;
		  this.stock = 0;
	  }
	  
	  public void display() {
		  System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	  }

}
