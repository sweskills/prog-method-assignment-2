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
		
		double a = readDouble ("enter the value of a");
		double b = readDouble ("enter the value of b");
	
		double c = Math.sqrt((a*a)+(b*b));
		print ("c:"+ c);
		
		
				
	}
}
