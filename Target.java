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
	}
}
add (new GOval(60, 20, 120, 120));

add (new GOval(80, 40, 80, 80));
add (new GOval(100, 60, 40, 40));
/* You fill this in. */
