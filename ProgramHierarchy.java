/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	public void run() {

		int SENTINEL;
		int n;
		SENTINEL = readInt("Enter Sentinel Value - ");
		
		for (int i=0; i<SENTINEL; i++) {
			n = readInt("?");
			println(n);
			if (n == SENTINEL){
				break;
				}
			println("End of Program");
		}
		
	}
}

