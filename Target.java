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
		
		GOval innercircle = new GOval(x, y, 21.6, 21.6);
		
		innercircle.setFillColor(Color.RED);
		
		add(innercircle);
		
		double i = (getWidth() - 46.8) / 2;
		
		double j = (getHeight() - 46.8) / 2;
		
		GOval midcircle = new GOval(i, j, 46.8, 46.8);
		
		add(midcircle);
		
		double a = (getWidth() - 72) / 2;
		
		double b = (getHeight() - 72) / 2;
		
		GOval outtercircle = new GOval(a, b, 72, 72);
		
		outtercircle.setFillColor(Color.RED);
		
		add(outtercircle);
		
		
		
	}
}
