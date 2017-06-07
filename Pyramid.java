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
	 private static final int BRICK_SPACE = 4;
	 
	 public void run() {
		 int initBrick = 30;
			int initPlacement = (getWidth() - BRICK_WIDTH - BRICK_SPACE) / 2;
		
			for (int i = 0; i < initBrick; i += 30)
			{
				int initX = i;
				int x = initX + initPlacement;
				GRect brick = new GRect(x, 0, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 60; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 15;
				int y = 12;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 90; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 30;
				int y = 24;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 120; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 45;
				int y = 36;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 150; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 60;
				int y = 48;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 180; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 75;
				int y = 60;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 210; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 90;
				int y = 72;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 240; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 105;
				int y = 84;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 270; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 120;
				int y = 96;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 300; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 135;
				int y = 108;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 330; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 150;
				int y = 120;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 360; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 165;
				int y = 132;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 390; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 180;
				int y = 144;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			for (int i = 0; i < 420; i += 30)
			{
				int initX = i;
				int x = (initX + initPlacement) - 195;
				int y = 156;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			

	 }
}