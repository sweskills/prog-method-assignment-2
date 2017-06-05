
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
		println("This program finds the largest and smallest numbers");
		int n = readInt("?:");
		int cnt = 0;
		while (true) {
			if (isEven(n)) {
				println(n + " is even, so I take half: " + n / 2);
				n = n / 2;
			} else {
				println(n + " is odd, so I make 3n+1: " + (3 * n + 1));
				n = (3 * n) + 1;
			}
			cnt++;
			if (n==1) break;
		}
		println("the process took " +cnt+ " steps to reach 1");
	}

	private boolean isEven(int n) {
		return n % 2 == 0;
	}
}
