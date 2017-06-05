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
		
		double a = (getWidth() - 72)/2;
		double b = (getHeight() - 72)/2;
		
		GOval outterCircle = new GOval(a,b,72,72);
		outterCircle.setFilled(true);
		outterCircle.setColor(Color.RED);
		add (outterCircle);
		
		double c = (getWidth() - 46.8)/2;
		double d = (getHeight() - 46.8)/2;
		
		GOval middleCircle = new GOval(c,d,46.8,46.8);
		middleCircle.setFilled(true);
		middleCircle.setColor(Color.WHITE);
		add (middleCircle);
		
		double e = (getWidth() - 21.6)/2;
		double f = (getHeight() - 21.6)/2;
		
		GOval innerCircle = new Goval (e,f, 21.6, 21.6)
		
	}			
				
}
	
	
	
	
	