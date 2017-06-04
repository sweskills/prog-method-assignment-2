/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	
	public void run() {
		
		int HEIGHT = getHeight();
		
		int WIDTH = getWidth();
		
		int x = HEIGHT / 2;
		
		int y = WIDTH / 2;
		
		GOval innercircle = new GOval(200, 200, 21.6, 21.6);
		
		add(innercircle);
		
		GOval midcircle = new GOval(200, 200, 46.8, 46.8);
		add(midcircle);
		
		
		
	}
}
