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
		
		int totalrect = getWidth() / BRICK_WIDTH;
		
		int y;
				
		int x;
		
		int rectsize = getHeight() / 30;
			
		x = (getWidth() - BRICK_WIDTH) / 2;
				
		y = (getHeight() - BRICK_HEIGHT) / 2;
		
		GRect Rect = new GRect(x, y, 30, 12);
					
		add(Rect);
		
		for (int rect=14; rect>0; rect--);
			
			GRect Rects = new GRect(x, getHeight(), 30, 12);
			add(Rects);
			    
			
				
			
		
			
	}
}

