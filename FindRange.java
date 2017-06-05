/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */



		import acm.program.*;

		public class FindRange extends ConsoleProgram {
			private static final int Sentinel = 0;
			public void run() {
			println("This program is to find the largest and the smallest");
			int min = 0;
			int max = 0;
			
			int firstVal = readInt();
			if(firstVal == Sentinel);{
				println("The value entered is Invalid");
				{
			while(true){
				
				int val = readInt();
				
				if(val == Sentinel){
				break;
				
			}
			if( val > max){
				max = val ;
			
			}else if (val < min){
				min = val;
			}
			}
			println("smallest num ;" +min);
			
			println("largest num :" +max);
			
			
			
			}

			
			}	
			}
			}
