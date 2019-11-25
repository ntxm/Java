package com.class25_1;

public class CarObjects {

	  String model;
	  double price;
	  int quantity;
	  
	  CarObjects(String model, double price, int quantity){
		this.model = model;
	    this.price = price;
	    this.quantity = quantity;
	    
	  }
	  
	  public void carStockValue(){
	    double total = price * quantity;
	    System.out.println(total);
	    
	  }
	  
	}
