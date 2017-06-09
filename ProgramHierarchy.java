/*
 * File: ProgramHierarchy.java
 * Name: Enoch Mbaebie
 * Program:Sweskills 
 * --------------------------- */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	//width of each box in the picture
	private static final int Width = 150;
	
	// height of each box in the picture
	private static final int Height = 60;
	
	public void run() {
		drawProgramBox();
		drawConsoleLine();
		drawConsoleBox();
		drawGraphicsLine();
		drawGraphicsBox();
		drawDialogLine();
		drawDialogBox();
	}
	private void drawProgramBox() {
		int x = getWidth()/2 - Width/2; 
		int y = getHeight()/2 - Height; 
		GRect drawBox = new GRect (x, y, Width, Height);  
		add(drawBox); 
		GLabel program = new GLabel("Program", x, y);
		add(program); 
		double boxCenterX = Width/2;
		double boxCenterY = Height/2;
		double halfProgramWidth = program.getWidth()/2;
		double halfProgramHeight = program.getAscent()/2; 
		program.move( (boxCenterX - halfProgramWidth) , (boxCenterY + halfProgramHeight) ); 
	}
	private void drawConsoleLine() {
		int x1 = getWidth()/2;  
		int y1 = getHeight()/2; 
		int x2 = getWidth()/2;  
		int y2 = getHeight()/2 + Height; 
		GLine drawLine = new GLine (x1, y1, x2, y2);
		add(drawLine);
	}
	private void drawConsoleBox() {
		int x = getWidth()/2 - Width/2; 
		int y = getHeight()/2 + Height;  
		GRect drawBox = new GRect (x, y, Width, Height); 		
		add(drawBox);
		GLabel console = new GLabel ("ConsoleProgram", x, y); 
		add(console);		
		double boxCenterX = Width / 2;
		double boxCenterY = Height / 2;
		double halfConsoleWidth = console.getWidth()/2; 
		double halfConsoleHeight = console.getAscent()/2; 
		console.move( (boxCenterX - halfConsoleWidth) , (boxCenterY + halfConsoleHeight) );
	}
	private void drawGraphicsLine() {
		int x1 = getWidth()/2;
		int y1 = getHeight()/2;
		int x2 = getWidth()/2 - 3 * (Width/2);
		int y2 = getHeight()/2 + Height;
		GLine drawLine = new GLine (x1, y1, x2, y2);
		add(drawLine);
	}
	private void drawGraphicsBox() {
		int x = getWidth()/2 - 2*Width;
		int y = getHeight()/2 + Height;
		GRect drawBox = new GRect (x, y, Width, Height); 
		add(drawBox); 
		GLabel graphics = new GLabel ("GraphicsProgram", x, y); 
		add(graphics); 
		double boxCenterX = Width / 2;
		double boxCenterY = Height / 2;
		double halfGraphicsWidth = graphics.getWidth()/2; 
		double halfGraphicsHeight = graphics.getAscent()/2; 
		graphics.move( (boxCenterX - halfGraphicsWidth) , (boxCenterY + halfGraphicsHeight) );
	}
	private void drawDialogLine() {
		int x1 = getWidth()/2;
		int y1 = getHeight()/2;
		int x2 = getWidth()/2 + 3 * (Width/2);
		int y2 = getHeight()/2 + Height;
		GLine drawLine = new GLine (x1, y1, x2, y2);
		add(drawLine);
	}
	private void drawDialogBox() {
		int x = getWidth()/2 + Width;
		int y = getHeight()/2 + Height;
		GRect drawBox = new GRect (x, y, Width, Height); 
		add(drawBox); 
		GLabel dialog = new GLabel ("DialogProgram", x, y); 
		add(dialog); 
		double boxCenterX = Width / 2;
		double boxCenterY = Height / 2;
		double halfDialogWidth = dialog.getWidth()/2; 
		double halfDialogHeight = dialog.getAscent()/2; 
		dialog.move( (boxCenterX - halfDialogWidth) , (boxCenterY + halfDialogHeight) );
	}
}