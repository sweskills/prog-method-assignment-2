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
		println("the smalest and the largest values");
					    	int max=0;
					    	int min=0;
					    	int val;
							
								while(true ){
								val =readInt (" ?");
								
								 if (val==SENTINEL){
									 break;
								 }
								 if (val>max){
									max=val;
								}
									else if(val<min){
											min=val;
										}
									}
								
								println("This is the maximum number"+max );
									
								println("This is the minun number"+min );
									}
	}
	

