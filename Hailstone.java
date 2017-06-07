/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* The program computes the Hailstone's sequence of any number
		 * entered by the user  
		 */
		
		println("...");
		println("Enter any number to get the Hailstone sequence: ");
		int x = readInt();
		int y = 0;
		
		while (x != 1) {
			
			if (x % 2 == 0) {
				
				println( "          " +x+ " is even, so i take half: " + x/2 );
				x /= 2;
				y++;
				
			}
			else{
				println( "          " +x+ " is odd, so i compute 3x + 1: " + (3 * x + 1) );
				x = 3 * x + 1;
				y++;
				
			}
			
		}
		println("...");
		println ("It took " + y + " steps to arrive at 1");
	}
}

