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
		GOval spar = new GOval(40, 20, 80,80);
		spar.setFillColor(Color.RED);
		
		add (spar);
	}
}
