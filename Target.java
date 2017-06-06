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
	
	private static final double OUTER = 1.0;
	private static final double MIDDLE = 0.65;
	private static final double INNER = 0.30;
	//
	double InchesToRadius = 72;
	double outerRad = OUTER * InchesToRadius;
	double middleRad = MIDDLE * InchesToRadius;
	double innerRad = INNER * InchesToRadius;
	double centerX = getWidth()/2;
	double centerY = getHeight()/2;
			
	
	public void run() {
		
		///
		GOval spar = new GOval(centerX - outerRad, centerY - outerRad, 2 * outerRad, 2 * outerRad);
		spar.setColor(Color.RED);
		spar.setFillColor(Color.RED);
		spar.setFilled(true);
		spar.sendToBack();
		add (spar);
		
		// 
		GOval spor = new GOval(centerX - middleRad, centerY - middleRad, 2 * middleRad, 2 * middleRad);
		spor.setColor(Color.WHITE);
		spor.setFillColor(Color.WHITE);
		spor.setFilled(true);
		spor.isVisible();
		add (spor);
		
		//
		GOval spea = new GOval(centerX - innerRad, centerY - innerRad, 2 * innerRad, 2 * innerRad);
		spea.setColor(Color.RED);
		spea.setFillColor(Color.RED);
		spea.setFilled(true);
		add (spea);
	}
}
