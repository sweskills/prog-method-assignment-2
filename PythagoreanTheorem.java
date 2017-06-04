/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;
import java.lang.Math;

public class PythagoreanTheorem extends ConsoleProgram {	
	public void run() {
		println("Enter values to compute Pythagorean Theorem.");
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		double total = a + b;
		println("c = " + total + ".");
	}
}
