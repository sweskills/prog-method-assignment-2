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
import java.awt.*;
 
public class Pyramid extends GraphicsProgram {
  private static final int brickWidth = 30;
  private static final int brickHeight = 12;
  private static final int brickInBase = 14;
 
  public void run() {
        putAllBricks();
    }
    private void putAllBricks()
    {
        for( int row = 0; row < brickInBase; row++ ){
        
            int bricksInRow = brickInBase - row;
 
            for( int brickNumber = 0; brickNumber < bricksInRow; brickNumber++ ){
            int x = ( getWidth()/2 ) - (brickWidth * bricksInRow) / 2 + brickNumber * brickWidth;
            int y = getHeight() - brickHeight * (row+1);
 
                GRect brick = new GRect( x , y , brickWidth , brickHeight );
                add(brick);
            }
        }
    }
}
