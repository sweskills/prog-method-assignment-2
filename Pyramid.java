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
	private static final int BRICKS_IN_BASE = 12;
	
	public void run() {
		/* You fill this in. */
		int totalPyramidWidth = BRICK_WIDTH * BRICKS_IN_BASE;
		int totalPyramidHeight = BRICK_HEIGHT * BRICKS_IN_BASE;
		int startingHeight = getHeight() - 0;
		int startingWidth = (getWidth() - totalPyramidWidth) / 2;
		int size = BRICKS_IN_BASE + 1;
		int x = startingWidth;
		for (int j = 0; j < BRICKS_IN_BASE; j++)
		{
			size--;
			int pyramidWidth = size * BRICK_WIDTH;
			x = (getWidth() - pyramidWidth) / 2;
			startingHeight -= BRICK_HEIGHT;
			for (int i = 0; i < size; i++)
			{
				GRect brick = new GRect(x, startingHeight, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
				x += BRICK_WIDTH;
			}
		}
	}		
}