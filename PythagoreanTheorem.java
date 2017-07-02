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
		
		
		int a = readInt("Input First Side of Triangle - ");
		int b = readInt ("Input Second Side of Triangle - ");
		
		double s = 0;
		s = Math.sqrt((a*a)+(b*b));
		
		println("a = " + a);
		println("b = " + b);
		println("s = " + s);
	}
}

