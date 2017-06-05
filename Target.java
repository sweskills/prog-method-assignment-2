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
		add (outterCircle);
	}			
				
}
	
	
	
	
	