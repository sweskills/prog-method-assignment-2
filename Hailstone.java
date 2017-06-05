/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;
import acm.util.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		
		
		int times = 100;
		int n = readInt ("Enter a number:");
		//
		
		if (n % 2 != 0 ){
			println ("+ x is odd");
			int n1 = (3*n) + 1;
			println ("so I make 3n+1:" + n);
		}	else {
			println ("+x is even");
			int n1 = n / 2;
			println ("so I take half:" + n);
			}
			/* You fill this in */
		}
	
}

	

