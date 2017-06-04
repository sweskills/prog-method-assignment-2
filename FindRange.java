/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int Sentinel = 0;
	
	public void run() {
		
		println("This program finds the largest and smallest numbers.");
		
		//initializes the minimum value
		int min = 0;
		
		//initializes the maximum value
		int max = 0;
		
		//iterates using while loop when the condition is true
		while (true) {
			
			//prompts the user to enter a value
			int val = readInt(" ? ");
			
			//checks if the first value entered is 0
			if (val == Sentinel) {
				break;
			}
			if (val > max) {
				max = val;
			} else if (val < min) {
				min = val;
			}
		}
		
		println("smallest: " + min);
		println("largest: " + max);
		
	}
}

