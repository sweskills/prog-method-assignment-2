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
	public void run(){
		        /* You fill this in. */
		        double a = (getWidth() - 72) / 2;
		        double b = (getHeight() - 72) / 2;
		       
		        GOval outtercircle = new GOval(a, b, 72, 72);
		       
		        outtercircle.setFilled(true);
		        outtercircle.setColor(Color.RED);
		       
		        add(outtercircle);
		       
		        double i = (getWidth() - 46.8) / 2;
		        double j = (getHeight() - 46.8) / 2;
		       
		        GOval midcircle = new GOval(i, j, 46.8, 46.8);
		       
		        midcircle.setFilled(true);
		        midcircle.setColor(Color.white);
		        add(midcircle);
		       
		        double x = (getWidth() - 21.6) / 2;
		        double y = (getHeight() - 21.6) / 2;
		       
		        GOval innercircle = new GOval(x, y, 21.6, 21.6);
		        innercircle.setFilled(true);
		        innercircle.setColor(Color.RED);
		       
		        add(innercircle);
		       
		    }
		
  
	 
	 
	 
		/* You fill this in. */
	}

