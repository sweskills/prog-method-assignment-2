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
		int n = readInt("Enter a number: ");
		
		/*stores the number of steps it takes to reach 1*/
		int counter = 0;
		
		while (n != 1) {
			
			/*checks if n is divisible by 2 without remainder*/
			if (n % 2 == 0) {
				
				println (n + " is even, so I take half: " + n/2);
				
				n = n / 2; 
				
				counter++; /*increments the steps*/
				
			} else {
				
				/*otherwise this*/
				println (n + " is odd, so I make 3n + l: " + (3 * n + 1));
				
				n = 3 * n + 1;
				
				counter++; 
				
			}
		}
		
		/*prints this at the end of the program*/
		println("The process took " + counter + " steps to reach 1");
	}
}

