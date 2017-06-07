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
	double centerX = getWidth();
	double centerY = getHeight();
			
	
	public void run() {
		
		///
		GOval spar = new GOval(2 * outerRad, 2 * outerRad);
		spar.setColor(Color.RED);
		spar.setFillColor(Color.RED);
		spar.setFilled(true);
		spar.sendToBack();
		add (spar);
		
		// 
		GOval spor = new GOval(2 * middleRad, 2 * middleRad);
		spor.setColor(Color.WHITE);
		spor.setFillColor(Color.WHITE);
		spor.setFilled(true);
		spor.isVisible();
		add (spor);
		
		//
		GOval spea = new GOval(2 * innerRad, 2 * innerRad);
		spea.setColor(Color.RED);
		spea.setFillColor(Color.RED);
		spea.setFilled(true);
		add (spea);
	}
}
