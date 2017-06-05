import acm.graphics.*;
import acm.program.*;

public class Pyramids extends GraphicsProgram {
	
/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() { bn 
		
		int startbrickno = 14;
		
		int x = (getWidth() - BRICK_WIDTH) / 2;
		
		int y = (getHeight() - BRICK_HEIGHT) / 2;
		
		for (int i = 0; i <startbrickno; i++) {
			
			GRect rect = new GRect(x, y, 30, 12);
			add(rect);
			
			if(i==startbrickno) {
				startbrickno = startbrickno - 1;
				i=0;
				y= y+12;
			}
			
		}
		
	}

}
