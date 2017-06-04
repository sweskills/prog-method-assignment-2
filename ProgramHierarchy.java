/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	public void run() {
		
		add (new GRect (230, 30, 120, 40));
		add (new GLabel("Program", 260, 58));
		
		//
		add (new GRect (20, 150, 140, 40));
		add (new GLabel("GraphicsProgram", 45, 178));
		
		//
		add (new GRect (230, 150, 130, 40));
		add (new GLabel("ConsoleProgram", 249, 178));
		
		//
		add (new GRect (450, 150, 130, 40));
		add (new GLabel("DialogProgram", 470, 178));
		
		//
		GLine first = new GLine(285.0, 68.0, 285.0, 150.0); 
		add (first);
		/* You fill this in. */
	}
}

