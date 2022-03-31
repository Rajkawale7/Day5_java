package com.bridgelabz;

import java.util.Scanner;

public class PowerOfNumProgram {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		 
		  int number, power, result=1;
	      System.out.println("Enter the base number: ");
	      number = r.nextInt();
	      
	      System.out.println("Enter the exponent power: ");
	      power = r.nextInt();

	      for (int i=1; i<=power; i++){
	         result = number*result;
	      }
	      
	      System.out.println("Result with The Power is " + result);
	   }
	}
