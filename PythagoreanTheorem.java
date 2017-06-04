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
		int a = readInt("a: ");
		int b = readInt("b: ");
		double total = Math.sqrt(a + b);
		println("c = total");
	}
}
