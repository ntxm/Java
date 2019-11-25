package com.class25_1;

public class Main {

	public static void main(String[] args) {
		
		ShoppingStore obj1 = new ShoppingStore("Blancket", 9.98, 10);
		ShoppingStore obj2 = new ShoppingStore("Mattress", 43.918, 10);
		
		double totalPrice1 = obj1.itemTotalPrice();
		double totalPrice2 = obj2.itemTotalPrice();
		
		
		System.out.println(obj1.item + " Total Value " + totalPrice1);
		System.out.println(obj2.item + " Total Value " + totalPrice2);
		System.out.println("You purchased " + (totalPrice1 + totalPrice2) + " Today");
	}

}


