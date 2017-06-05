
 import acm.graphics.*;
  import acm.program.*;
  import java.awt.*;
 
  public class Pyramid extends GraphicsProgram {
  	private static final int BRICKS_IN_BASE = 32;
  	private static final int BRICK_WIDTH = 15;
  	private static final int BRICK_HEIGHT = 14;
  	public void run() {
 		 /* You fill this in. */
 		double x = (getWidth() - BRICKS_IN_BASE * BRICK_WIDTH) / 2;
 		double y = getHeight() - BRICK_HEIGHT;
 		for (int row = 0; row < BRICKS_IN_BASE; row++) {
 			createRow(x, y, (BRICKS_IN_BASE - row));
 			y -= BRICK_HEIGHT;
 			x += BRICK_WIDTH / 2;
 		}
	}
	private void createRow(double x, double y, int bricks) {
 		for (int i = 0; i < bricks; i++) {
 			createBrick((x + i * BRICK_WIDTH), y);
		}
	}

	private void createBrick(double x, double y) {
 		GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
 		add(rect);
  	}
  }