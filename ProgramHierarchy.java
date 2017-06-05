/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

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
	public static final int BOX_WIDTH = 150;
	public static final int BOX_HIGHT = 50;
	public static final int SPACE = 20;

	public void run() {
		int y;
		int x;

		int x_top = (getWidth() - BOX_WIDTH) / 2;
		int y_top = (getHeight() - 3 * BOX_HIGHT) / 2 - BOX_HIGHT;
		GRect box_top = createLabelledBox("Program", x_top, y_top);

		y = (getHeight() - 3 * BOX_HIGHT) / 2 + (BOX_HIGHT);
		x = (getWidth() - 3 * BOX_WIDTH - 2 * SPACE) / 2;
		GRect box = createLabelledBox("GraphicsProgram", x, y);
		add(new GLine(x_top + box_top.getWidth() / 2, y_top + box_top.getHeight(), x + box.getWidth() / 2, y));

		x = x + BOX_WIDTH + SPACE;
		createLabelledBox("ConsoleProgram", x, y);
		add(new GLine(x_top + box_top.getWidth() / 2, y_top + box_top.getHeight(), x + box.getWidth() / 2, y));

		x = x + BOX_WIDTH + SPACE;
		createLabelledBox("DialogProgram", x, y);
		add(new GLine(x_top + box_top.getWidth() / 2, y_top + box_top.getHeight(), x + box.getWidth() / 2, y));

	}

	private GRect createLabelledBox(String content, int x, int y) {
		GLabel label = new GLabel(content);
		// label.setFont("Times-72");
		GRect box = new GRect(BOX_WIDTH, BOX_HIGHT);
		add(box, x, y);
		add(label, x + (box.getWidth() - label.getWidth()) / 2, y + (box.getHeight() + label.getAscent() / 2) / 2);
		return box;

	}
}
