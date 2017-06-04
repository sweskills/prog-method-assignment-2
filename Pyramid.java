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
		/* You fill this in. */
		int startY = getHeight()-BRICK_HEIGHT;
		int startX;
		for (int i = BRICKS_IN_BASE; i >0; i--)
		{
			startX = getWidth() / 2;
			startX -= i * (BRICK_WIDTH/2);
			for (int j = i; j > 0; j--)
			{
				GRect rect = new GRect(startX,startY,BRICK_WIDTH,BRICK_HEIGHT);
				add(rect);
				startX += BRICK_WIDTH;
			}
			startY -= BRICK_HEIGHT;
		}
	}
}
