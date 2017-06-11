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
	
	/**constants*/
	public static final int BOX_WIDTH = 120;
	
	public static final int BOX_HEIGHT = 60;
	
	public void run() {
		drawBoxes();
		drawLines();	
	}
	
	private void drawBoxes(){
		drawProgram();
		drawGraphics();
		drawConsole();
		drawDialog();
	}

	private void drawLines(){
		drawConsoleLine();
		drawDialogLine();
		drawGraphicsLine();
	}
	
	private void drawProgram(){
		
		//draws the program box
		GRect programBox = new GRect (BOX_WIDTH, BOX_HEIGHT);
		
		int x = getWidth() / 2 - BOX_WIDTH / 2;
		
		int y = getHeight() / 4;
		
		add(programBox, x, y);
		
		//draws the program label
		GLabel programLabel = new GLabel ("Program");
		
		int labelX = (int) (getWidth() / 2 - programLabel.getWidth() / 2);
		
		int labelY = (int) (getHeight() / 4 + BOX_HEIGHT / 2 + programLabel.getAscent() / 2);
		
		add(programLabel, labelX, labelY);
	}
	
	private void drawGraphics(){
		
		//draws the dialog box
		GRect graphicsBox = new GRect (BOX_WIDTH, BOX_HEIGHT);
		
		int x = getWidth() / 2 - BOX_WIDTH * 2;
		
		int y = getHeight() / 2;
		
		add(graphicsBox, x, y);
		
		//draws the dialog label
		GLabel graphicsLabel = new GLabel ("GraphicsProgram");
		
		int labelX = (int) (getWidth() / 2 - BOX_WIDTH * 2 + graphicsLabel.getWidth() / 8);
		
		int labelY = (int) (getHeight() / 2 + BOX_HEIGHT / 2 + graphicsLabel.getAscent() / 2);
		
		add(graphicsLabel, labelX, labelY);
	}
	
	private void drawConsole(){
		
		//draws the console box
		GRect consoleBox = new GRect (BOX_WIDTH, BOX_HEIGHT);
		
		int x = getWidth() / 2 - BOX_WIDTH / 2;
		
		int y = getHeight() / 2;
		
		add(consoleBox, x, y);
		
		//draws the console label
		GLabel consoleLabel = new GLabel ("ConsoleProgram");
		
		int labelX = (int) (getWidth() / 2 - consoleLabel.getWidth() / 2);
		
		int labelY = (int) (getHeight() / 2 + BOX_HEIGHT / 2 + consoleLabel.getAscent() / 2);
		
		add(consoleLabel, labelX, labelY);
	}
	
	private void drawDialog(){
		
		//draws the dialog box
		GRect dialogBox = new GRect (BOX_WIDTH, BOX_HEIGHT);
		
		int x = getWidth() / 2 + BOX_WIDTH;
		
		int y = getHeight() / 2;
		
		add(dialogBox, x, y);
		
		//draws the dialog label
		GLabel dialogLabel = new GLabel ("DialogProgram");
		
		int labelX = (int) (getWidth() / 2 + BOX_WIDTH + dialogLabel.getWidth() / 4);
		
		int labelY = (int) (getHeight() / 2 + BOX_HEIGHT / 2 + dialogLabel.getAscent() / 2);
		
		add(dialogLabel, labelX, labelY);
	}
	
	private void drawConsoleLine(){
		
		//initial coordinates
		int x = getWidth() / 2;
		
		int y = getHeight() / 2 - BOX_HEIGHT;
		
		//final coordinates
		int dx = getWidth() / 2;
		
		int dy = getHeight() / 2;
		
		//draws line
		GLine consoleLine = new GLine(x, y, dx, dy);
		
		add(consoleLine);
	}
	
	private void drawDialogLine(){
		
		//initial coordinates
		int x = getWidth() / 2;
		
		int y = getHeight() / 2 - BOX_HEIGHT;
		
		//final coordinates
		int dx = (int) (getWidth() / 2 - BOX_WIDTH * 1.5);
		
		int dy = getHeight() / 2;
		
		//draws line 
		GLine dialogLine = new GLine(x, y, dx, dy);
		
		add(dialogLine);
	}
	
	private void drawGraphicsLine(){
		
		//initial coordinates
		int x = getWidth() / 2;
		
		int y = getHeight() / 2 - BOX_HEIGHT;
		
		//final coordinates
		int dx = (int) (getWidth() / 2 + BOX_WIDTH * 1.5);
		
		int dy = getHeight() / 2;
		
		//draws line
		GLine graphicsLine = new GLine(x, y, dx, dy);
		
		add(graphicsLine);
	}
	
	
}

