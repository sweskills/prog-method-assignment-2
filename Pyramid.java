
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
 
public class Pyramid extends GraphicsProgram {
 
/** Width of each brick in pixels */
    private static final int BRICK_WIDTH = 40;
 
/** Height of each brick in pixels */
    private static final int BRICK_HEIGHT = 12;
 
/** Number of bricks in the base of the pyramid */
    private static final int BRICKS_IN_BASE = 14;
     
/** New window size */
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 400;
     
    public void run() {
         
        int brick_level = 0;
        int brick_order = 0;
        int x, y;
         
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // adapting the window
         
        // looping through each brick level
        for (brick_level = 0; brick_level <= BRICKS_IN_BASE - 1; brick_level++) {
             
            // looping through each brick for a particular level
            for (brick_order = 0; brick_order <= BRICKS_IN_BASE - brick_level - 1; brick_order++) {
                 
                x = (WINDOW_WIDTH - BRICK_WIDTH * (BRICKS_IN_BASE - brick_level)) / 2 + BRICK_WIDTH * brick_order;
                y = WINDOW_HEIGHT - BRICK_HEIGHT * (brick_level + 1);
                GRect rectangle = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
                add(rectangle);
                 
            }
        }
    }
}