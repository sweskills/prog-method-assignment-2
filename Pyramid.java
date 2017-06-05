/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		/* You fill this in. */
		
		int n = 1;
		
		for (int m = BRICKS_IN_BASE; m > 0; m--) {
			
		addCenteredRowOfBricks(int m, int n) {	
		n++
		}
		
		private void addCenteredRowOfBricks(double m, double n) {
		
			double x = getHeight() - n*BRICK_HEIGHT;
			addBrick(x,y);
			
			for (double i = m; i > 1; i--){
				
				x+ = BRICK_WIDTH;
				addBrick(x,y);
				
				
			}
		}
			
		}
		}
}

