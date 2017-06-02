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
		
		//
		println("this program computes the square and of two numbers and produceits root");
		int a = readInt("enter a: ");
		int b = readInt("enter b: ");
		
		//
		double a1 = Math.pow(a,2);
		double b1 = Math.pow(b,2);
		double c1 = a1 + b1;
		double c = Math.sqrt(c1);

		//
		println("this is the sqare root of:" + c1);
		/* You fill this in */
	}
}
