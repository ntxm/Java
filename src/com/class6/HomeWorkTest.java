package com.class6;

import java.util.Scanner;


class MainClass {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean isSanny;
    int temperature;
    
    System.out.println("Input boolean value");
    isSanny = scan.nextBoolean();
    System.out.println("Input any value");
    temperature = scan.nextInt();
    
    if(isSanny == true){
      System.out.println("It is a sunny day, I should go somewhere!");
        if(temperature > 85) {
          System.out.println("I am going to the beach");
        }else{
          System.out.println("I am going to the park");
        }
    
    }else{
      System.out.println("I stay home and practice Java");
    }
    
  }
}