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
		
    buildPyramid();
    
	}
	private void buildPyramid(){
		for (int i = 0; i<14; i++);{
			int level_counter = 1;
			int number_of_bricks = (BRICKS_IN_BASE) + (- 1 + 1);
			
			int x= (getWidth()/2) - (number_of_bricks/2);
			int y = (- 1*getHeight()) + (number_of_bricks/2);
		}
	}
}

