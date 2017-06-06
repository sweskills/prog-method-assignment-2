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
		
		double maxiDiameter = 2 * 1 * inch2Pix;
		double mediDiameter = 2 * 0.65 * inch2Pix;
		double miniDiameter = 2 * 0.30 * inch2Pix;
		
		double x = getWidth()/2;
		double y = getHeight()/2;
		
		GOval maxiTarget = new GOval(x - maxiDiameter, y - maxiDiameter, maxiDiameter, maxiDiameter);
		maxiTarget.setFilled(true);
		maxiTarget.setColor(Color.RED);
		add(maxiTarget);
		
		GOval mediTarget = new GOval(x - mediDiameter, y - mediDiameter, mediDiameter, mediDiameter);
		mediTarget.setFilled(true);
		mediTarget.setColor(Color.WHITE);
		add(mediTarget);
		
		GOval miniTarget = new GOval(x - miniDiameter, y - miniDiameter, miniDiameter, miniDiameter);
		miniTarget.setFilled(true);
		miniTarget.setColor(Color.RED);
		add(miniTarget);
	}
}
