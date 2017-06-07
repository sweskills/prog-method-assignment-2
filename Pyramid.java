/*
 * File: Pyramid.java
 * Name: Enoch Mbaebie
 * Sweskills Tech Talent Academy
 * -----------------------------
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
	private static final int BRICK_WIDTH = 40;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 14;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 16;
	
	public void run() {
		/* You fill this in. */
		double x = (getWidth() - BRICKS_IN_BASE * BRICK_WIDTH) / 2;
		double y = getHeight()  - BRICK_HEIGHT;
		for (int row = 0; row < BRICKS_IN_BASE; row++);	{
			int row = 0;
			drawRow(x, y, (BRICKS_IN_BASE - row));
			y -= BRICK_HEIGHT;
			x += BRICK_WIDTH / 2;			
		}
	}
		private void drawRow(double x, double y, int bricks){
		for (int i = 0; i < bricks; i++) {
			drawBrick((x + i * BRICK_WIDTH), y);
			}
		}
		private void drawBrick(double x, double y){
			GRect rect = new GRect (x,y, BRICK_WIDTH, BRICK_HEIGHT);
			rect.setColor (Color.BLACK);
			add(rect);
		}
}
		