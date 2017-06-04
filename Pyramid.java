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
		
		int WIDTHOFBASE = getWidth();
				
		int HEIGHT = getHeight();
		
		int y;
				
		int x;
		
		for (int i= 0; i<WIDTHOFBASE; i++) {
			for (int j=0; j<HEIGHT; j++) {
				x = i * 14;
				
				y = j * 14;
	
				GRect Rect = new GRect(100, 75, 30, 12);
					
			    add(Rect);
			    
			}
				
			
		}
			
	}
}

