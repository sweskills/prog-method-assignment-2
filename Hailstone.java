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
		
		println("Enter a number:");
		
		int n = readInt("enter n: ");
		
		while (n > 1) { //this while loop runs as long as n is > 1 because the Hailstone sequence does not apply to integers = 1 and below// 
			
			if ((n % 2) == 0) { //if n is even, n is divided by 2//
				
				n = (n / 2) ;
				
				println("n is even, so i take half: " + n );
				
			}else if ((n % 2) == 1) { //if n is odd, n is multiplied by 3 and 1 is added to it//
				
				n = (3 * n) + 1 ;
				
				println("n is odd, so i make 3n + 1: " + n );
			}
		}
	
	}
}

