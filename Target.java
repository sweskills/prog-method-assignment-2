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
		
		///
		GOval spar = new GOval(40, 20, 120,120);
		spar.setColor(Color.RED);
		spar.setFillColor(Color.RED);
		spar.setFilled(true);
		spar.sendToBack();
		add (spar);
		
		// 
		GOval spor = new GOval(60, 40, 80, 80);
		spor.setColor(Color.WHITE);
		spor.setFillColor(Color.WHITE);
		spor.setFilled(true);
		spor.isVisible();
		add (spor);
		
		//
		GOval spea = new GOval(80, 60, 40, 40);
		spea.setColor(Color.RED);
		spea.setFillColor(Color.RED);
		spea.setFilled(true);
		add (spea);
	}
}
