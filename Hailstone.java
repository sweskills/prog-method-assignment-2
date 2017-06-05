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
		int x = readInt ("Enter a number:");
		int n ;
		//
		for (int i = n; i < 1; i++){
		if (x % 2 != 0 ){
			println ("+ x is odd");
			int n = (3*x) + 1;
			println ("so I make 3n+1:" + n);
		}	else {
			println ("+x is even");
			int n = x / 2;
			println ("so I take half:" + n);
			}
			/* You fill this in */
		}
	
	}
	
}
	

