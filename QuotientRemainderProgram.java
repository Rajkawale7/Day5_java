package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainderProgram {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
//Taking values from user
		System.out.println("Enter Your Dividend Number: ");
		int num1 = s.nextInt();
		
		System.out.println("Enter Your Divisor Number: ");
		int num2 = s.nextInt();

//To perform the operation
		System.out.println("_________________________________________________________________________");
		
		System.out.println("Quotient = " + num1/num2);
		System.out.println("Remainder= " + num1 % num2);
		
 }
}

