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


	private double xMidPoint;
	private double yMidPoint;
	private double xStartPoint;
	private double yStartPoint;
	private double xEndPoint;
	
	
	public void run() {
		xMidPoint = getWidth()/2;
		yMidPoint = getHeight()/2;
		xStartPoint = (xMidPoint - (BRICK_WIDTH*(BRICKS_IN_BASE)/2));
		yStartPoint = (getHeight()-(BRICK_HEIGHT*14));
		//xEndPoint = xStartPoint + (14*30);
		
		for (double i=xStartPoint; i<xEndPoint ; i+=15) 
		{
		GRect rectBricks = new GRect (i, yStartPoint, BRICK_WIDTH, BRICK_HEIGHT);
		add(rectBricks);
		}
		
	}
}

