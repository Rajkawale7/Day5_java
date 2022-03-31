package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumberProgram {

	public static void main(String[] args) {

		// Assigning the variables
		double num = 0, result = 0,  i;
		
		Scanner sc = new Scanner(System.in);

		//Taking data from users (Assuming Any number is a Harmonic_number)
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();

		//Condition by using for loop
		for (i = 1; i <= n; i++) {
			num = num + (1 / i);
			result = num;
		}
		System.out.println("The value of harmonic no. " + n + " is: " + result);

	}
}
