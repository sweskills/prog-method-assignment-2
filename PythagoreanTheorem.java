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
		println("Enter values to compute Pythagorean theorem.");
		int a = readInt("enter a: ");
		
		int b = readInt("enter b: ");
		
		a = a * a;
		b = b * b;
		
		double c = Math.sqrt(a + b);
		println("The answer is " + c + " . ");
		
		
		
	}
}
