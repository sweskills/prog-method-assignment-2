/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

//Program to find the largest and the smallest numbers

public class FindRange extends ConsoleProgram {
	
	private int SENTINEL = 0;
	
	public void run() {
		
		println("This Program finds the largest and smallest numbers");
		
		int numberInput =1;
		int largeNum = 0;
		int smallNum = 1000000000;
		
		
		
		
		while (numberInput!=0){
			
			if (numberInput == 0){
			println("You have not entered any valid number");
			} else {
		numberInput = readInt("?");
		
										
		if (numberInput > largeNum) {
			largeNum = numberInput;
		}
		
		if ((numberInput < smallNum) && (numberInput != SENTINEL)) {
			smallNum = numberInput;
		}
		}
		println ("Largest Number is " + largeNum);
		println ("Smallest Number is " + smallNum);
	}
	}

}
