package com.class25_1;

public class ShoppingStore {

	  String item;
	  double price;
	  int quantity;
	  
	  ShoppingStore(String item, double price, int quantity){
	    this.item = item;
	    this.price = price;
	    this.quantity = quantity;
	    
	  }
	  
	      double itemTotalPrice(){
	      double total = price * quantity;
	      return total;
	      
	      
	    }
	  
	  
	  
	}
