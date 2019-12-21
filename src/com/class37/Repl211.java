package com.class37;
/*
 * Map and List (Follow Steps Carefully)
Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList. 
Step 2: Create appleMap<String, Object> and add below pairs into it. 
"Items", "Apple"
"Price", 20.00
"Quantity", 10
Step 3: Add appleMap to dataList. 
Step 4: Create orangeMap<String, Object> and add below pairs into it. 
"Items", "Orange" 
"Price", 21.99
"Quantity", 10
Step 5: Add orangeMap to dataList. 
Step 6: Create a loop from dataList. 
Step 7: Retrieve each Key and store is in a variable. 
Step 8: calculate the subtotal of each object. 
Step 9: Print the values of each Iteration same as shown below in Output example. 
Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase. 

Step 11: After Loop Print the value of Total Purchase. 

NOTE: as the values are Object you have to do casting properly while retrieving from for each map. 

Output: 

Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998
Your Purchase total : 419.9
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Repl211 {

	public static void main(String[] args) {
		//declare s List in which we store collection of Maps
		List<Map<String, Object>> dataList = new ArrayList<>();
		
		//create a map that store String as Key and Object as Value
		Map<String, Object> appleMap = new TreeMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);
		
		//Storing map inside the list
		dataList.add(appleMap);
		
		
		Map<String, Object> orangeMap = new TreeMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
		
		//Storing map inside the list
		dataList.add(orangeMap);
		
		//System.out.println(dataList);
		
		//find purchase price total
		double totalPurchasePrice = 0;
		
		
		for(Map<String, Object> map : dataList) {
			String items = map.get("Items").toString();
			//System.out.println(items);
			double price = Double.parseDouble(map.get("Price").toString());
			//System.out.println(price);
			double quantity = Double.parseDouble(map.get("Quantity").toString());
			//System.out.println(quantity);
			double total = price * quantity;
			//System.out.println(total);
			
			System.out.println("Items: " + items + " Quantity: " + quantity +
					" SubTotal: " + total);
			
			totalPurchasePrice += total; 
		}
		
		System.out.println("Your Purchase total : " + totalPurchasePrice);
		
		
	}
}