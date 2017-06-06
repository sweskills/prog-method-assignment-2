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
		 int initBrick = 30;
			int initPlacement = (getWidth() - BRICK_WIDTH) / 2;
		
			for (int i = 0; i < initBrick; i += 30)
			{
				int initX = i;
				int x = initX + initPlacement;
				GRect brick = new GRect(x, getHeight()/2, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			
			//for (int i = 0; i < 60; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 15;
				int y = 12;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}

	
		 
	 }
	}
