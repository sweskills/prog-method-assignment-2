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
	 
	 //number of space between adjacent bricks
	 
	 
	 public void run() {
		 
		 
		 
			 dBricks();
			 for (int i = 0; i <= BRICKS_IN_BASE; i++ )	{
				 return;
		 }
	 }
	 private void dBricks(){
		 GRect dBricks =  new GRect ((getWidth()/2), (getHeight()/2), BRICK_WIDTH, BRICK_HEIGHT);
		 dBricks.setFilled(false);
		 add (dBricks);
	 }
}