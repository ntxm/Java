package com.class23;

class Main {
	  
	  static int count=0;
	  
	  static void counter(){
	    for (int i = 0; i < 3; i++){
	      Main.count++;
	      
	    }
	  }
	  
	  
	  public static void main(String[] args) {
	    
	    Main obj1 = new Main();
	    Main obj2 = new Main();
	    Main obj3 = new Main();
	    
	   
	    obj1.counter();
	    obj2.counter();
	    obj3.counter();
	   
	  }
	}