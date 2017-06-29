/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {

		 public int SENTINEL = 0;
	        
	        System.out.println("The program finds the largest and smallest values");
	        
	        int firstNumber = readInt("Enter first number");
	        int smallest = firstNumber;
	        int largest = firstNumber;
	        
	        if (firstNumber == SENTINEL)
	            System.out.print("You did not enter a valid value");
	        else
	            System.out.println("you can now enter others");
	        
	        
	        while(int otherNumber > SENTINEL){
	        otherNumber = readInt("Enter other integers");
	        
	        if(otherNumber == null){
	           
	            System.out.println(first+ "is the largest as well as th smallst");
	        }
	        else{
	           largestNumber = otherNumber;
	        if(lagestNumber > otherNumber)
	            
	        }
	        }
	}