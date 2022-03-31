package com.bridgelabz;

import java.util.Scanner;

public class LargerNumberProgram {
	public static void main (String[] args) {		
	 	Scanner s = new Scanner(System.in);

	//Taking values from user::
		System.out.println("Enter the first number: ");
		int num1 = s.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = s.nextInt();
		
		System.out.println("Enter the third number: ");
		int num3 = s.nextInt();

	//if_else statements::
		if (num1 > num2) {
		System.out.println(num1 + " is larger value");
		}
		else if (num2 > num3){
		System.out.println(num2 + " is larger value");
		}
		else
			System.out.println(num3 + " is larger value");

	 }

}
