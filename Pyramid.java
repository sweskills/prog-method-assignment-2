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
	
		
		}
	
	public void placeBricks() {
		
		double xMidPoint = getWidth()/2;
		double yMidPoint = getHeight()/2;
		
		double xCenterPoint = (xMidPoint - (BRICK_WIDTH/2));
		double yCenterPoint = (yMidPoint - (BRICK_HEIGHT * BRICKS_IN_BASE)/2);
		
		int xIncrementor = 0;
		
		for (int i=0; i<BRICKS_IN_BASE; i++) {
			xIncrementor++;
			xCenterPoint -= (BRICK_WIDTH/2);
			
			for (int j=0; j < xIncrementor; j++) {
				
				double xNewPosition = j * BRICK_WIDTH;
				double yNewPosition = i * BRICK_HEIGHT;
				
				GRect rect = new GRect ((xNewPosition + xCenterPoint), (yNewPosition + yCenterPoint), BRICK_WIDTH, BRICK_HEIGHT);
				add(rect);
				}
			}
	
		
		
	}
			
	}
	

