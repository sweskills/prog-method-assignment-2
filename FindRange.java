/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		/* 
		 * This program finds the range of 
		 * any set of numbers until the Sentinel
		 * value is reached 
		 */
		println("This program finds displays the minimum and");
		println("maximum values in a given set of numbers");
		
			
		println("Enter a value");
		int val = readInt();
		if (val == SENTINEL){
			println("Number not valid");
		}
		
		int min = 0;
		int max = 0;
	}
	private static final int SENTINEL = 20;
}

