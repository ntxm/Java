package com.class24;

public class Country {
	public String capital, name; 
	public int population;
	
	Country(){
		System.out.println("I am not argument constructor");
	}
	
	Country(String name, String capital, int population){
		this.name = name;
		this.capital = capital;
		this.population = population;
		
		
	}
	
	public void displayInfo() {
		System.out.println(name + " " + capital);
	}
	
	public static void main(String[] args) {
		//Country country1 = new Country();
		//country1.name = "Usa";
		//country1.capital = "Washington dc";
		
		//Country country2 = new Country();
		//country2.name = "Kazakhstan";
		//country2.capital = "Astana";
		
		Country country1 = new Country("USA", "Washington DC", 60000);
		Country country2 = new Country("Kazakhstan", "Astana", 12000);
		Country country3 = new Country();
		
		
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();
		
		System.out.println(country1.name);
		System.out.println(country1.capital);
		
		
		
		}

}
