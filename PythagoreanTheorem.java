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
	
	//runs the program
	public void run() {
		
		println("Enter values to compute Pythagorean Theorem.");
		
		//prompts the user to enter a value for side a
		int a = readInt("a: ");
		
		//prompts the user to enter a value for side b
		int b = readInt("b: ");
		
		//computes the value for side c i.e. add the squares of a & b and then take the square root
		double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		//prints out the result
		println("c = " + result);
	}
}
