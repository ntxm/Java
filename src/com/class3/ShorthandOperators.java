package com.class3;

public class ShorthandOperators {

	public static void main(String[] args) {
		
		int num3 = 1000;
		num3+=1000; // num3 = num3 + 1000;
		System.out.println(num3); // 2000

		
		int num4 = 50;
		num4 += 20; // num4 = num4 + 20;
		System.out.println(num3); // 2000
		
		num4-=30; // num4 = num4 - 30; //(70-30)=40
		System.out.println(num4);
		
		num4 /= 10; //num4 = num4 / 10; // 40/10 = 4;
		System.out.println(num4);
		
		num4%=2; // num4%2 
		System.out.println(num4);
		
		//-------------------------------------------------------------
		
		int i = 25;
		i += 100; // i = i + 100
		System.out.println(i);

		int i1 = 345;
		i1 -= 67; // i1 = i1 - 67;
		System.out.println(i1);
		
		double cakePiece = 11;	
		cakePiece /= 4; // cakePiece = cakePiece / 4;
		System.out.println(cakePiece);
		
		
	   int cakePiece1 = 25;
	   cakePiece1 %= 7; // cakePiece1 = cakePiece % 7 // =4 remainder
	   System.out.println(cakePiece1);
		
		
	}

}
