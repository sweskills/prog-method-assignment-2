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
		add (spar);
		
		//
		GOval spor = new GOval(60, 40, 80, 80);
		spor.setColor(Color.WHITE);
		spor.setFillColor(Color.WHITE);
		spor.setFilled(true);
		spor.setVisible(true);
		add (spor);
		
		//
		GOval spea = new GOval(80, 60, 40, 40);
		spor.setColor(Color.RED);
		spor.setFillColor(Color.RED);
		spor.setFilled(true);
		add (spea);
	}
}
