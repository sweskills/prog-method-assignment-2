/*
 * File: PythagoreanTheorem.java

 * Name: Enoch Mbaebie
 * Sweskills Facilitator: Azeez 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

/* Console Program for Pythagorean Computation*/

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println ("Input Number for computation.");
		int a = readInt ("a:");
		int b = readInt ("b:");
		double c = Math.sqrt ((a * a) + (b * b));
		println ("c:" + c);
	}
}
