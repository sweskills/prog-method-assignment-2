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
	
	
	//
	double InchesToRadius = 72;
	double outerRad = 1.0 * InchesToRadius;
	double middleRad = 0.65 * InchesToRadius;
	double innerRad = 0.3 * InchesToRadius;
	double x = getWidth();
	double y = getHeight();
	
	//
	private GOval outerCircle;
	
	//
	private GOval middleCircle;
	
	//
	private GOval innerCircle;
			
	
	public void run() {
		
		//
		outerCircle = new GOval(x, y, 2 * outerRad, 2 * outerRad);
		outerCircle.setColor(Color.RED);
		outerCircle.setFillColor(Color.RED);
		outerCircle.setFilled(true);
		outerCircle.sendToBack();
		add (outerCircle);
		
		// 
		middleCircle = new GOval(x, y, 2 * middleRad, 2 * middleRad);
		middleCircle.setColor(Color.WHITE);
		middleCircle.setFillColor(Color.WHITE);
		middleCircle.setFilled(true);
		middleCircle.isVisible();
		add (middleCircle);
		
		//
		innerCircle = new GOval(x, y, 2 * innerRad, 2 * innerRad);
		innerCircle.setColor(Color.RED);
		innerCircle.setFillColor(Color.RED);
		innerCircle.setFilled(true);
		add (innerCircle);
	}
}
