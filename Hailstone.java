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
		
		int n = readInt("Enter a number: ");
		
		int m = 0;
		
		while (n != 1) {
			if (n % 2 == 0) {
				println (n + " is even, so I take half: " + n/2);
				n = n/2;
				m++;
			} else {
				println (n + " is odd, so I make 3n+l: " + (3 * n + 1));
				n = 3 * n + 1;
				m++;
			}
		}
		
		println("The process took " + m + " to reach 1");
	}
}

