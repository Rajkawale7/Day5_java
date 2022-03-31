package com.bridgelabz;

import java.util.Scanner;

public class FlipCoinProgram {
	public static void main(String[] args) {
		System.out.println("**Welcome to the coin flip Game**");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your Number: ");
		
		int headCount = 0, tailCount = 0;
		int count =sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			double random = Math.random();
			
			if (random < 0.5)
				tailCount++;
			else
				headCount++;
		}
			System.out.println("Pecentage of tails("+ tailCount +"): " + (tailCount * 100f / (headCount+tailCount)));
			System.out.println("Percentage of Head("+ headCount +"): " + (headCount * 100f / (headCount+tailCount)));
			
	}

}

