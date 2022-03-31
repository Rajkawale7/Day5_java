//Desc -> Computes the prime factorization of N using brute force.
//b. I/P -> Number to find the prime factors

package com.bridgelabz;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
				
		//Taking value from users
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Number : ");
		int n = sc.nextInt();
		

		// Printing the prime factors
		System.out.print("The Prime Factors of " + n + " are : ");

		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			} else
				i++;
		}
		System.out.println(" ");
	}

}
