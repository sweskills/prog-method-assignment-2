/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;
/* Sentinel Console Program that read Integers*/
public class FindRange extends ConsoleProgram {
	private static final int SENTINEL_VALUE = 0;
	public void run() {
		println ("Find the Largest and Smallest number:");
		int value = readInt ("?");
		if (value == SENTINEL_VALUE) {
			println ("Values None Entered");
		}
		else
		    {
			int smallest = value;
			int largest = value;
			while (true) {
				value = readInt ("?");
				if (value == SENTINEL_VALUE) break ;
				if (smallest > value) smallest = value;
				else if (largest < value) largest = value;
				}
			println ("smallest:" + smallest);
			println ("largest:" + largest);
		    }
		    }	
		}

