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
	
		int w = getWidth() / 2; 
		int x = 0;
		int j = BRICKS_IN_BASE; 
		int y = getHeight(); 


			for (int k = 1; k <= 14; k++) { 

		for (int i = 0; i < j; i++) {	

		GRect brick = new GRect(w + x + (i * BRICK_WIDTH), y, BRICK_WIDTH, BRICK_HEIGHT);

					add (brick);
		}
		y = getHeight() - (BRICK_HEIGHT * k);
		x = k * (BRICK_WIDTH / 2);
		j--;

				}
		
		}
			
	}
	
}

