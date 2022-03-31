package com.bridgelabz;

import java.util.Scanner;

public class LeapYearProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    //Year Declaration
	    System.out.println("Enter the year: ");
	    int year = sc.nextInt();   //Year Initialization
	   
	   //Checking for leap year
	    if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
	    System.out.println(year+" is a leap year");
	    else
	    System.out.println(year+" is not a leap year");
		
		}
	}