/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	
	/*this program computes the length of the hypotenuse according to pythagoras theorem
	 * it accepts values for a and b as integers and then calculates the solution
	 *  of c as a double.
	*/
	
	
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
