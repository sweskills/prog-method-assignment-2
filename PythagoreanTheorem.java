/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends DialogProgram {
	public void run() {
		
		//
		println("this program computes the square and of two numbers and produceits root");
		double a = readDouble("enter a: ");
		double b = readDouble("enter b: ");
		
		//
		double a1 = Math.pow(a,2);
		double b1 = Math.pow(b,2);
		
		//
		double c1 = Math.sqrt (a1 + b1);
		

		//
		println("this is the sqare root of:" + c1);
		/* You fill this in */
	}
}
