/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		
		int n;
		int i;
		println("Enter a number number ");
		
		n =readInt(" Number ");
		while (n>1){
			if((n%2)==0){
				n=(n/2);
				println("this is even I make halfn/2" +n);
				
			}
			
			else if ((n%2)==1){
		
				n=((3*n)+1);
				
				println(" this is ond I make 3*n +1" +n);
				
				
			}
		}
	}
}

