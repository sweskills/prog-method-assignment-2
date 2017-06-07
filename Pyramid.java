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
	
		buildPyramid();
		
		}
	
	private void buildPyramid() {
		int totalBrick = BRICKS_IN_BASE;
		int numRow = BRICKS_IN_BASE;
		
		double y = getHeight() - BRICK_HEIGHT;
		
		while (numRow > 0) {
			double x = (getWidth())/2 - (BRICK_WIDTH*totalBrick)/2;
			
			for (int i=totalBrick; i<0; i--) {
				GRect myBrick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(myBrick);
						x += BRICK_WIDTH;
			}
			totalBrick--;
			numRow--;
			y-=BRICK_HEIGHT;
		}
		
	}
	
}

