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
		GOval oval1 = new GOval(300, 300, 72, 72);
		oval1.setFilled(true);
		oval1.setFillColor(Color.RED);
		
		add(oval1);
	}
}
