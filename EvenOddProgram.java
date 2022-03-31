package com.bridgelabz;

import java.util.Scanner;

public class EvenOddProgram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	 
	 System.out.println("Enter a number: ");
     int number = s.nextInt();

     if(number % 2 == 0)
         System.out.println(number + " is even");
     else
         System.out.println(number + " is odd");
 }

}
