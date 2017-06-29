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
		GOval oval1 = new GOval(300, 137, 72, 72);
		oval1.setFilled(true);
		oval1.setFillColor(Color.RED);
		add(oval1);
		
		
		GOval oval2 = new GOval(310, 148, 49, 49);
		oval2.setFilled(true);
		oval2.setFillColor(Color.WHITE);
		add(oval2);
		
		GOval oval3 = new GOval(318, 155, 34, 34);
		oval3.setFilled(true);
		oval3.setFillColor(Color.RED);
		add(oval3);
		
		
	}
}
