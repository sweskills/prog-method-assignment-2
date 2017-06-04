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
		
		println("Enter values to compute Pythagoras theorem");
		
		//the user is asked to input two integers a and b//
		
		int a = readInt("enter a: ");
		
		int b = readInt("enter b: ");
		
		a = a * a ; //a is raised to the power of 2 in other words the square of a// 
		
		b = b * b ; //b is raised to the power of 2 in other words the square of b//
		
		double c = Math.sqrt(a + b); //this computes the sum of the squares of a and b as the value for c//
		
		println("The answer is " + c + " ." ); 
		
		
	}
}
