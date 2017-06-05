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
			
			
			println("This program find the smallest and largest number");
			
			int max = 0;
			
			int min = 0;
			
			
			
				int val = readInt(" ? ");
				while (val != SENTINEL){
				//
				
				if (val > max){
						max = val;
					
				}	else if(val < min) {
						min = val;
				}
				
			
				println (" smallest: " + min);
				
				println (" largest: " + max);
				}
				
					println (" Sentinel is reached ");
		/* You fill this in */
	}
}

			
