/*
 * File: PythagoreanTheorem.java

 * Name: Enoch Mbaebie
 * Sweskills Facilitator: Azeez 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		println ("Input Number for computation.");
		int a = readInt ("a:");
		int b = readInt ("b:");
		double c = Math.sqrt (a * a + b * b);
		println ("c:" + c);
	}
}
