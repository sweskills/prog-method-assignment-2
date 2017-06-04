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
	
	private static final int Sentinel = 0;
	
	public void run() {
		println("This program finds the largest and smallest numbers.");
		int min = 0;
		int max = 0;
		
		while (true) {
			int val = readInt(" ? ");
			if (val == Sentinel) {
				break;
			}
			if (val > max) {
				max = val;
			} else if (val < min) {
				min = val;
			}
		}
		
		println("smallest: " + min);
		println("largest: " + max);
		
		
		
		
	}
}

