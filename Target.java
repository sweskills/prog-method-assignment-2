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
		/* You fill this in. */
		
			drawLargeRedOval();
			 drawWhiteOval();
			 drawSmallRedOval();
		}
			
			/* You fill this in. */
		public void  drawLargeRedOval() {
		GOval oval1= new GOval(64, 64, 72, 72);
		oval1.setFilled(true);
		oval1.setColor(Color.red);
		add (oval1);
		}
		public void  drawWhiteOval(){
		GOval oval2= new GOval(76.6, 76.6, 46.8, 46.8);
		oval2.setFilled(true);
		oval2.setColor(Color.white);
		add (oval2);
		}
		public void  drawSmallRedOval() {
		GOval oval3= new GOval(89.2, 89.2, 21.6, 21.6);
		oval3.setFilled(true);
		oval3.setColor(Color.red);
		add (oval3);
		}
	}
		
		
		
		
		
	

