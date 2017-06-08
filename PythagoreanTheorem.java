/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;
import java.util.Scanner;


public class PythagoreanTheorem extends ConsoleProgram {
	
		 public static void main(String[] args){
				
				double legA, legB;
			
				
				//Declare a String object to store the uer's name, 
				
				
				//Create a Scanner object for reading in the user's input
				Scanner input= new Scanner(System.in);

				
				//Prompt the user for the lengths of the legs, 
				//and store those two pieces of information in legA and legB.
				System.out.println("Please enter the length of the "
					+ "first leg of the right triangle:");
				legA = input.nextDouble();

				System.out.println("Please enter the length of the "
					+ "second leg of the right triangle:");
				legB = input.nextDouble();

				//System.out.println(legA + " " + legB);
				
				//Declare variables for the quantities to be calculated.
				double hypotenuse;

				//Calculate the hypotenuse using the Pythagorean Theorem:
				//a^2 + b^2 = c^2
				//c = Math.sqrt(a^2 + b^2)
				hypotenuse = Math.sqrt((legA*legA) + (legB*legB));

				//Report the results for hypotenuse.
				System.out.println();
				System.out.println("the hypotenuse of your " + hypotenuse);
				
				
				}
	}

		
		
		
		
		
		
	