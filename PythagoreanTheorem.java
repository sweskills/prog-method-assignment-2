/*

 * File: PythagoreanTheorem.java

 * Name: Enoch Mbaebie
 * Program: Sweskills Tech Talent Academy 
 * --------------------------------------
 */
/* Console Program for Pythagorean Computation*/

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println ("Input Number for computation.");
		int a = readInt ("a:");
		int b = readInt ("b:");
		double c = Math.sqrt ((a * a) + (b * b));
		println ("c:" + c);
	}
}
