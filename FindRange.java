/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;
import java.lang.Math;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 0;
	
	public void run() {
		println("This program finds the largest and smallest numbers.");
		int small = 0;
		int large = 0;
		int value = readInt(" ? ");
		while (value != SENTINEL) {
			Math.min(small, value);
			Math.max(large, value);
			value = readInt(" ? ");
		}
		
		println("smallest: " + value);
		println("largest: " + value);
		
		
	}
}

