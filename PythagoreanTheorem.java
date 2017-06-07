/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		
				/* You fill this in */
				println("This program is to solve pythagorean Theorom");
				println("Enter the value of A: ");
				int a = readInt(); 
				println("Enter the value of B: ");
				int b = readInt();
				
				double c = Math.sqrt((a*a) + (b*b));
				println("The Square of A and B  is store in C which is :" );
				println(c);
						
						
			}
		
	}

