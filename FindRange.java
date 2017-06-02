/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	private static final int SENTINEL = 0 ;
	
	public void run() {
		println("This program finds the largest and smallest numbers.");
		
		int total = 0;
		while (true){	
			int val = readInt("enter val: ");
			if (val == SENTINEL) break;
			total += val;
		}
		println("Total = " + total);
	}
}

