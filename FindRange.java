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
			
			
			println("this program output the smallest and largest number");
			
			int max = 0;
			int min = 0;
			
			
			while (true){
				int val = readInt("?");
				
				//
				if (val == SENTINEL)	{
					println (" Sentinel is reached "); 
					break;
				}
				if (val > max){
					val = max;
					
				}	else if(val < min) {
					val = min;	
				}
				
			}
				println (" smallest: " + min);
				println (" largest: " + max);
		
		/* You fill this in */
	}
}

			
