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
	
	//
		public void run() {
	
		int n = readInt ("?");
		int m = 0;
		
		while (n != 1){
			if (n % 2 == 0){
				println (n + " is even, so i take half: " + n/2 );
				n /= 2;
				m++;
			}	else {
				println (n + " ia odd, so I make 3n + 1: " + ((3*n) +1));
				n = (3 * n) + 1;
				m++;
			}
						
						
				
				
		}
		/* You fill this in */
	}
}

