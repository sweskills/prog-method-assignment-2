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
		
		//
		int n = readInt ("?");
		
		//set counter as m
		int m = 0;
		
		//
		while (n != 1){0
			if (n % 2 == 0){
				println (n + " is even, so i take half: " + n/2 );
				n /= 2;
				m++;
			}
			
			//
			else {
				println (n + " ia odd, so I make 3n + 1: " + ((3*n) +1));
				n = (3 * n) + 1;
				m++;
			}
			
			//
			println (" process of steps " + m + " steps to reach 1 ");
		
			}
			/* You fill this in */
		
	
	}
	
}
	

