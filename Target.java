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
		private double inch = 72;
	
	public void run() {
		
		firstCircle();
		secondCircle();
		thirdCircle();
					
		}
	
		public void firstCircle(){
		double radius = inch * 1;
		double x = (getWidth()/2) - radius/2;
		double y = ((getHeight()/2) - radius/2);
		
		GOval firstOval = new GOval (x, y, radius, radius);
		add(firstOval);
		firstOval.setFilled(true);
		firstOval.setFillColor(Color.RED);
		}
		
		public void secondCircle() {
		double radius = inch * 0.65;
		double x = ((getWidth())/2) - radius/2;
		double y = ((getHeight()/2) - radius/2);
			
		GOval secondOval = new GOval (x, y, radius, radius);
		add(secondOval);
		secondOval.setFilled(true);
		secondOval.setColor(Color.WHITE);
		secondOval.setFillColor(Color.WHITE);
		}
		
		
		public void thirdCircle() {
		double radius = inch * 0.3;
		double x = (getWidth()/2) - radius/2;
		double y = ((getHeight()/2) - radius/2);
		
		GOval thirdOval = new GOval (x, y, radius, radius);
		add(thirdOval);
		thirdOval.setFilled(true);
		thirdOval.setFillColor(Color.RED);
		}
		
		
}
