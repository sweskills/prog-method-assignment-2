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
	
	private static final double BOX_WIDTH = 150;
	private static final double BOX_HEIGHT = 50;
	private static final double BOX_SPACING = 20;
	
	public void run() {
		
		double centerX = getWidth()/2 - BOX_WIDTH/2; 
		double centerY = getHeight()/2 - BOX_HEIGHT/2;
		lowerRects(centerX, centerY);
		upperRect(centerX, centerY);
		
		GLine consoleToProgram = new GLine(centerX + BOX_WIDTH/2, centerY, centerX + BOX_WIDTH/2, centerY - 2 * BOX_SPACING);
		add(consoleToProgram);
		
		GLine graphicsToProgram = new GLine(centerX + BOX_WIDTH/2, centerY, centerX + BOX_WIDTH/2, centerY - 2 * BOX_SPACING);
		add(graphicsToProgram);
		
		GLine dialogToProgram = new GLine(centerX + BOX_WIDTH/2, centerY, centerX + BOX_WIDTH/2, centerY - 2 * BOX_SPACING);
		add(dialogToProgram);
	}
	
	private void lowerRects(double centerX, double centerY) {
		
		GRect graphicsProgramBox = new GRect(centerX - BOX_WIDTH - BOX_SPACING , centerY, BOX_WIDTH, BOX_HEIGHT);
		add(graphicsProgramBox);
		
		GRect consoleProgramBox = new GRect(centerX, centerY, BOX_WIDTH, BOX_HEIGHT);
		add(consoleProgramBox);
		
		GRect dialogProgramBox = new GRect(centerX + BOX_WIDTH + BOX_SPACING , centerY, BOX_WIDTH, BOX_HEIGHT);
		add(dialogProgramBox);
	}
	
	
	private void upperRect(double centerX, double centerY) {
		
		GRect ProgramBox = new GRect(centerX, centerY - BOX_HEIGHT - 2 * BOX_SPACING, BOX_WIDTH, BOX_HEIGHT);
		add(ProgramBox);
		
	}
}

