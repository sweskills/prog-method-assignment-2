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
		int x = readInt("Enter a number: ");
		
		/*stores the number of steps it takes to reach 1*/
		int z = 0;
		
		while (x != 1) {
			
			/*checks if x is divisible by 2 without remainder*/
			if (x % 2 == 0) {
				
				println (x + " is even, so I take half: " + x/2);
				
				x = x / 2; 
				
				z++; /*increments the steps*/
				
			} else {
				
				/*otherwise this*/
				println (x + " is odd, so I make 3n + l: " + (3 * x + 1));
				
				x = 3 * x + 1;
				
				z++; 
				
			}
		}
		
		/*prints this at the end of the program*/
		println("The process took " + z + " steps to reach 1");
	}
}

