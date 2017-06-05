/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 0;
	public void run() {
		println("This program finds the largest and smallest numbers");
		int a =  readInt("?:");
		int min = a;
		int max = a;
		if (a!=SENTINEL){
			while (true){
				a =  readInt("?:");
				if (a==SENTINEL) break;
				min = (a<min) ? a : min;
				max = (a>max) ? a : max;
			}
		}
		println("Smallest: "+min);
		println("Largest: "+max);
		
	}
}

