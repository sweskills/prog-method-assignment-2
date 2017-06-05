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
		println("*********************************************************");
		println("Enter the values of A and B to compute Pythagoras theorem");
	int a = readInt ("A = ");
		println("/n");
	int b = readInt ("B = ");
	
	int c = ((a*a) + (b*b));
	
	double x = Math.sqrt (c);
	println("/n");
	println(x);
	println("*********************************************************");
	
	}
}
