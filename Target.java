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
		
		double inchToPix = 72;
		
		double outerRad = 1 * inchToPix;
		double middleRad = 0.65 * inchToPix;
		double innerRad = 0.30 * inchToPix;
		double x = getWidth()/2;
		double y = getHeight()/2;
		
		GOval outerOval = new GOval (x - outerRad, y - outerRad, 2 * outerRad, 2 * outerRad);
		outerOval.setFilled(true);
		outerOval.setColor(Color.RED);
		add(outerOval);
		
		GOval middleOval = new GOval (x - middleRad, y - middleRad, 2 * middleRad, 2 * middleRad);
		middleOval.setFilled(true);
		middleOval.setColor(Color.WHITE);
		add(middleOval);
		
		GOval innerOval = new GOval (x - innerRad, y - innerRad, 2 * innerRad, 2 * innerRad);
		innerOval.setFilled(true);
		innerOval.setColor(Color.RED);
		add(innerOval);
		
	}
}
