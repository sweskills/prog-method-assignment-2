/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	
	//runs the program
	public void run() {
		
		//prompts the user to enter a number
		int n = readInt("Enter a number: ");
		
		//stores the number of steps it takes to reach 1
		int m = 0;
		
		//checks the condition when n is not equal to 1
		while (n != 1) {
			
			//checks if n is divisible by 2 without remainder
			if (n % 2 == 0) {
				
				//it carries out this operation if true
				println (n + " is even, so I take half: " + n/2);
				
				n = n / 2; //divides n by 2
				
				m++; //increments the steps
				
			} else {
				
				//otherwise it does this
				println (n + " is odd, so I make 3n + l: " + (3 * n + 1));
				
				n = 3 * n + 1; //multiplies n with 3 and add 1
				
				m++; //the steps increase
				
			}
		}
		
		//prints out this when it reaches 1 signifying the end of the program
		println("The process took " + m + " steps to reach 1");
	}
}

