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
		
		/*the center of the run window is determined and each circle shares a particular
		 * reference point, the only difference being their radius, each radius has been
		 * from inches to pixels. 
		 */
		
		double a = (getWidth() - 72) / 2;
		
		double b = (getHeight() - 72) / 2;
		
		GOval outtercircle = new GOval(a, b, 72, 72); 
		
		outtercircle.setFilled(true); 
		outtercircle.setColor(Color.RED);
		
		add(outtercircle); //this gives a red circle of radius 72 pixels from reference point//
		
		double i = (getWidth() - 46.8) / 2;
		
		double j = (getHeight() - 46.8) / 2;
		
		GOval midcircle = new GOval(i, j, 46.8, 46.8);
		
		midcircle.setFilled(true);
		midcircle.setColor(Color.RED);
		add(midcircle); //this creates a white circle of radius 46.8 pixels from reference point//
		
		double x = (getWidth() - 21.6) / 2;
		
		double y = (getHeight() - 21.6) / 2;
		
		GOval innercircle = new GOval(x, y, 21.6, 21.6);
		innercircle.setFilled(true);
		innercircle.setColor(Color.RED);
		
		add(innercircle); //this creates a red circle of radius 21.6 pixels from reference point//
		
		
		
		
	}
}
