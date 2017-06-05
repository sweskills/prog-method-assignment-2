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
		
		double radius_1 = 72;
		double radius_2 = radius_1*0.65;
		double radius_3 = radius_1*0.3;
		this.addCenteredCircle(this.createCircle(radius_1, 1));
		this.addCenteredCircle(this.createCircle(radius_2, 2));
		this.addCenteredCircle(this.createCircle(radius_3, 3));
	}
	
	private void addCenteredCircle(GOval circle) {
		add(circle, (getWidth()-circle.getHeight())/2,(getHeight()-circle.getHeight())/2);
	}

	private GOval createCircle(double radius, int circle_number){
		GOval circle = new GOval(radius,radius);
		circle.setFilled(true);
		circle.setColor(circle_number%2==0? Color.WHITE : Color.RED );
		return circle;
		
	}
}
