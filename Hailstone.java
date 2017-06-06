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
		println("Enter n: ");
		int n = readInt("n: ");
		
		while(n>1){
			if(n % 2 == 0){
				n = n/2;
				println(+n+ " is even so i make n/2");
			}
			if(n % 2 == 1){
				n=(3*n)+1;
				println( +n+" is even so i make 3n+1");
		}
		
		}
		
	}
}


