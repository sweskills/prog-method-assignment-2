/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	private static final int HEIGHT = 50;
	
	private static final int WIDTH = 150;
	
	public void run() {
		
		int x;
		int y;
		
		x = (getWidth() - WIDTH) / 2;
		
		y = (getHeight() - HEIGHT) / 2;
		
		GRect Rect = new GRect(x, y, WIDTH, HEIGHT);
		
		add(Rect);
	}
}

