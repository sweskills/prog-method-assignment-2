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
		
		double x = (getWidth() - 21.6) / 2;
		
		double y = (getHeight() - 21.6) / 2;
		
		GOval innercircle = new GOval(x, 200, 21.6, 21.6);
		
		add(innercircle);
		
		GOval midcircle = new GOval(x, 178, 46.8, 46.8);
		add(midcircle);
		
		
		
	}
}
