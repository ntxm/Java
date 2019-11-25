package com.class24;

public class Main {

	public static void main(String[] args) {
		
		 StoreProduct product1 = new StoreProduct("Eggs", 3, "Produce", true, 10);
		 StoreProduct product2 = new StoreProduct("Paper Towels", 2, 24);
		 StoreProduct product3 = new StoreProduct("Paper Towels", 4);
		 
		 
		 product1.display();
		 product2.display();
		 product3.display();

	}

}
