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
	
/** instance variable */
	private GRect brick;
	
	public void run() {
		
		int x = getWidth() / 4;
		
		int y = getHeight() - BRICK_HEIGHT;
		
		for (int row = 0; row < BRICKS_IN_BASE; row++) { //this adds the first row of bricks at the base
			
			x = getWidth() / 4 + (BRICK_WIDTH / 2) * row;
			
			for (int i = BRICKS_IN_BASE - row; i > 0; i--) { //this decreases the number of bricks after the first row at the base upwards
				
				brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
				
				add(brick); //adds the bricks upward in descending order
				
				x += BRICK_WIDTH;
			}
			
			y -= BRICK_HEIGHT;
			
		}
	}
}

