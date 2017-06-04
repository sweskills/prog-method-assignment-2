/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;

import acm.program.*;

public class Pyramid extends GraphicsProgram {

/* Defining the constants values */

   private static final int BRICK_WIDTH = 30;

   private static final int BRICK_HEIGHT = 12;

   private static final int BRICKS_IN_BASE = 14;

    

/* Defining the position of the PYRAMID */

   public void run() {

       double x = getWidth() / 2-BRICK_WIDTH;

       double y = getHeight() - BRICKS_IN_BASE * BRICK_HEIGHT;

        

/* For loop draws the current row then evaluates the x and y of the row beneath.*/

       for (int i = 0; i < BRICKS_IN_BASE; i++) {

           drawRow(x, y, i);

           y += BRICK_HEIGHT;

           x -= BRICK_WIDTH / 2;

       }

   }

    

/* Draw bricks in current row */

   private void drawRow(double x, double y, int count) {

       for (int i = 0; i <= count; i++) {

           add(new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT));

           x += BRICK_WIDTH;

       }

 

   }

}