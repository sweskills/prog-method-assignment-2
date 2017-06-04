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
		
		
			int columnWidth = 30;
			for (int i = 0; i < columnWidth; i = 30 + i)
			{
				int x = i;
				for (int j = 0; j < BRICKS_IN_BASE; j++)
				{
					int y = BRICK_HEIGHT * j;
					GRect brick2 = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
					add(brick2);
					columnWidth = columnWidth * j;
				}
			}
				
		}
	}
}

