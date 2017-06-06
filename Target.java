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
		/*
		 * This program draws an archery target
		 */
		double inch2Pix = 72;
		
		double maxiRadius = 1 * inch2Pix;
		double mediRadius = 0.65 * inch2Pix;
		double miniRadius = 0.30 * inch2Pix;
		
		double x = getWidth()/2;
		double y = getHeight()/2;
		
		GOval maxiTarget = new GOval(x - maxiRadius, y - maxiRadius, 2 * maxiRadius, 2 * maxiRadius);
		maxiTarget.setFilled(true);
		maxiTarget.setColor(Color.RED);
		add(maxiTarget);
		
		GOval mediTarget = new GOval(x - mediRadius, y - mediRadius, 2 * mediRadius, 2 * mediRadius);
		mediTarget.setFilled(true);
		mediTarget.setColor(Color.WHITE);
		add(mediTarget);
		
		GOval miniTarget = new GOval(x - miniRadius, y - miniRadius, 2 * miniRadius, 2 * miniRadius);
		miniTarget.setFilled(true);
		miniTarget.setColor(Color.RED);
		add(miniTarget);
	}
}
