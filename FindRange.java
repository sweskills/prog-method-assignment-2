/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	/*specifies the value of the sentinel*/
	private static final int Sentinel = 0;
	
	public void run() {
		
		println("This program finds the largest and smallest numbers.");
		
		/*initializes the minimum value*/
		int min = 0;
		
		/*initializes the maximum value*/
		int max = 0;
		
		while (true) {
			
			/*prompts the user to enter a value*/
			int val = readInt(" ? ");
		
			if (val == Sentinel) {
				break;
			}
			
			/*checks if the value is greater than the maximum value and then assign it as the largest*/
			if (val > max) {
				max = val;
				
			/*checks if the value is less than the minimum value and then assign it as the smallest*/
			} else if (val < min) {
				min = val;
			}
		}
		
		/*prints the smallest number*/ 
		println("smallest: " + min);
		
		/*prints the largest number*/
		println("largest: " + max);
		
	}
}

