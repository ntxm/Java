package com.class27;

public class CardTest {

	public static void main(String[] args) {
		
		//take an Object of the child class and give reference to the parent
		
		// new AX(); ----> create NEW object, NOT ASSIGNED
		//reference variable = object is created
		
		
		Card card = new AX(); // typecasting
	//   |     |       |	
	// type  name   new object	
		card.chargeInterest();
		card.creditLimit();
		
		
		Card card1 = new MC();
		card1.creditLimit();
		
		
		Card card2 = new Visa();
		card2.creditLimit();
		
		
		Card[] cardArray = {card, card1, card2};
		Card[] cardArray1 = {new MC(), new AX(), new Visa(), new Discovery()};
		
		for(Card myCard: cardArray1) {
			myCard.chargeInterest();
			myCard.creditLimit();
		}
		
		
		
		MC mc1 = new MC();
		MC mc2 = new MC();
		MC mc3 = new MC();
		
		MC[] masterCard = {mc1, mc2, mc3};
		for(MC mCard: masterCard) {
			mCard.chargeInterest();
			mCard.chargeInterest();
			mCard.creditLimit();
			
		}
		
	}

}
