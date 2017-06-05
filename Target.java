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
	 GOval first = new GOval(40,20,120,120);
	 first.setColor(Color.RED);
	 first.setFillColor(Color.RED);
	 first.setFilled(true);;
	 first.sendToBack();
	 add (first);
	 
	 //
	 GOval second = new GOval(60,40,80,80);
	 second.setFillColor(Color.WHITE);
	 second.setFilled(true);
	 second.setFillColor(Color.WHITE);
	 second.isVisible();
	 add (second);
	 
	 //
	 GOval third = new GOval(80,60,40,40);
	 third.setColor(Color.RED);
	 third.setFilled(true);
	 third.setFillColor(Color.RED);
	 add (third);
	 
	 
	 
		/* You fill this in. */
	}
}
