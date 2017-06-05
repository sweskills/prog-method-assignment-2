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
		println("Enter values to compute pythagoras theorem");
		int a = readInt("enter a: ");
		int b = readInt("enter b: ");
		a =  a * a ;
		b = b * b ;
		double c = Math.sqrt(a + b);
		println("The answer is " + c + " . " );
		
		/* two numbers are been added to give their square root of the final answer*/
	}
}
