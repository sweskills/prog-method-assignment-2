/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	
	/*runs the program*/
	public void run() {
		
		/*prompts the user to enter a number*/
		int m = readInt("Enter a number: ");
		
		/*stores the number of steps it takes to reach 1*/
		int counter = 0;
		
		while (m != 1) {
			
			/*checks if m is divisible by 2 without remainder*/
			if (m % 2 == 0) {
				
				println (m + " is even, so I take half: " + m/2);
				
				m = m / 2; 
				
				counter++; /*increments the steps*/
				
			} else {
				
				/*otherwise this*/
				println (m + " is odd, so I make 3n + l: " + (3 * m + 1));
				
				m = 3 * m + 1;
				
				counter++; 
				
			}
		}
		
		/*prints this at the end of the program*/
		println("The process took " + counter + " steps to reach 1");
	}
}

