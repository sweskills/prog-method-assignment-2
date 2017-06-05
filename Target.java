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
		
		//conversion from inches to pixels
		double inchToPix = 72;
		
		//set radii and center coordinates
		double outerRad = 1 * inchToPix;
		double middleRad = 0.65 * inchToPix;
		double innerRad = 0.30 * inchToPix;
		double centerX = getWidth()/2;
		double centerY = getHeight()/2;
		
		GOval outerOval = new GOval (centerX - outerRad, centerY - outerRad, 2 * outerRad, 2 * outerRad);
		outerOval.setFilled(true);
		outerOval.setColor(Color.RED);
		add(outerOval);
		
		GOval middleOval = new GOval (centerX - middleRad, centerY - middleRad, 2 * middleRad, 2 * middleRad);
		middleOval.setFilled(true);
		middleOval.setColor(Color.WHITE);
		add(middleOval);
		
		GOval innerOval = new GOval (centerX - innerRad, centerY - innerRad, 2 * innerRad, 2 * innerRad);
		innerOval.setFilled(true);
		innerOval.setColor(Color.RED);
		add(innerOval);
		
	}
}
