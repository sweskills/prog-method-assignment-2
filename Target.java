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
	
	/*runs the program*/
	public void run() {
		
		/*conversion from inches to pixels*/
		double inchToPixel = 72;
		
		/*set radii and center coordinates*/
		double outerRad = 1 * inchToPixel;
		
		double middleRad = 0.65 * inchToPixel;
		
		double innerRad = 0.30 * inchToPixel;
		
		double centerX = getWidth()/2;
		
		double centerY = getHeight()/2;
		
		/*draw the circles, add them to canvas and set their respective colors*/
		
		/*outerCircle*/
		GOval outerCircle = new GOval (centerX - outerRad, centerY - outerRad, 2 * outerRad, 2 * outerRad);
		
		outerCircle.setFilled(true);
		
		outerCircle.setColor(Color.RED);
		
		add(outerCircle);
		
		/*middleCircle*/
		GOval middleCircle = new GOval (centerX - middleRad, centerY - middleRad, 2 * middleRad, 2 * middleRad);
		
		middleCircle.setFilled(true);
		
		middleCircle.setColor(Color.WHITE);
		
		add(middleCircle);
		
		/*innerCircle*/
		GOval innerCircle = new GOval (centerX - innerRad, centerY - innerRad, 2 * innerRad, 2 * innerRad);
		
		innerCircle.setFilled(true);
		
		innerCircle.setColor(Color.RED);
		
		add(innerCircle);
		
	}
}
