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
		
		
		
		int x = readInt ("Enter a number:");
		
		//
		while (x > 1){
			if (x % 2 != 0 ){
				println ("+ x is odd");
				int y = (3*x) + 1;
				println ("so I make 3n+1:" + y);
		}	else {
				println ("+x is even");
				int y = x / 2;
				println ("so I take half:" + y);
			}
			int y = x;
			/* You fill this in */
		}
	
	}
	
}
	

