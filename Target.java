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
	
 
	public void run(double OUTTERRad) {
	//the first OVAL
		double OUTERRad = readDouble();
		double INNERRad = readDouble(); 
		double MIDDLERad = readDouble(); 
		double inchToPixel = 72;
		double x = readDouble();
		double y = readDouble();
		double OUTER = 1.0;
		 double MIDDLE = 0.65;
		double INNER = 0.3;

		 x = getWidth()/2;
		 y = getHeight()/2;
		
		
	 OUTERRad = OUTER*inchToPixel; 
		GOval p = new GOval (40,20,120,120);
		p.setColor(Color.RED);
		p.setFillColor (Color.RED);
		p.setFilled(true);
		p.sendToBack();
		add(p);
	
	GOval OUTTER =new GOval(x - OUTTERRad,y  - OUTTERRad,OUTTERRad *2,OUTTERRad*2 );
		
		//the second oval which is the middle shell
		
		MIDDLERad = MIDDLE*inchToPixel;       
		GOval r = new GOval (60,40,80,80);
		r.setColor(Color.WHITE);
		r.setFillColor (Color.WHITE);
		r.setFilled(true);
		r.isVisible();
		add(r);
		
		GOval INNERr =new GOval(x - INNERRad,y  - INNERRad,INNERRad *2,INNERRad*2 );
		INNERRad = INNER*inchToPixel; 
		GOval s = new GOval (80,60,40,40);
		s.setColor(Color.RED);
		s.setFillColor (Color.RED);
		s.setFilled(true);
		add(s);
		
	     
		
	}
}
