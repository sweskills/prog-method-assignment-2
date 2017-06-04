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
		
		GLabel label1 = new GLabel("Program", (x + 50), (y + 30));
		
		add(label1);
		
		GLine Line1 = new GLine((x + 75), (y+50), (x+75), (y+100));
		
		add(Line1);
		
		GRect Rect2 = new GRect(x, (y+100), WIDTH, HEIGHT);
		
		add(Rect2);
		
		GLabel label2 = new GLabel("ConsoleProgram", (x + 30), (y + 130));
		
		add(label2);
		
		GLine Line2 = new GLine((x - 100), (y+100), (x+75), (y+50));
		
		add(Line2);
		
		GRect Rect3 = new GRect((x-175), (y+100), WIDTH, HEIGHT);
		
		add(Rect3);

		GLabel label3 = new GLabel("GraphicsProgram", (x - 145), (y + 130));
		
		add(label3);
		
		GLine Line3 = new GLine((x + 75), (y+50), (x+175), (y+100));
		
		add(Line3);
	}
	
}

