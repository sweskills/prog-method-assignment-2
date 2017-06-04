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
	
	private static final int a = (int) Math.pow(a, 2);
	
	private static final int b = (int) Math.pow(b, 2);
	
	public void run() {
		println("Enter values to compute Pythagorean Theorem.");
		int a = readInt("a: ");
		int b = readInt("b: ");
		double c = Math.sqrt(a + b);
	}
}
