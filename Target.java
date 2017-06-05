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
	private static final double INNER = 0.3;
	public void run() {
	//
		GOval p = new GOval (60,40,120,120);
		p.setColor(Color.RED);
		p.setFillColor (Color.RED);
		p.sendToBack();
		add(p);
		
		//
		
		GOval r = new GOval (60,40,80,80);
		r.setColor(Color.WHITE);
		r.setFillColor (Color.WHITE);
		r.setFilled(true);
		r.isVisible();
		add(r);
		
		GOval s = new GOval (80,60,40,40);
		s.setColor(Color.RED);
		s.setFillColor (Color.RED);
		s.setFilled(true);
		add(s);
		
	}
}
