package com.class14;

import java.util.Scanner;

public class Quize3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        if(h1 > h2 && h2 > h3 || h1 == h2 && h2 > h2 || h1 > h2 && h2 == h3 ||
        h1 < h2 && h2 < h3 || h1 == h2 && h2 < h3 || h1 < h2 && h2 == h3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
		

		

		

	}

}
