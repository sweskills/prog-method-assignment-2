
 import acm.graphics.*;
  import acm.program.*;
  import java.awt.*;
 
  public class Pyramid extends GraphicsProgram {
  	private static final int BRICKS_IN_BASE = 14;
  	private static final int BRICK_WIDTH = 30;
  	private static final int BRICK_HEIGHT = 12;
  	public void run() {
 		 /* You fill this in. */
 		double x = (getWidth() - BRICKS_IN_BASE * BRICK_WIDTH) / 2;
 		double y = getHeight() - BRICK_HEIGHT;
 	for (int row = 0; row < BRICKS_IN_BASE; row++) {
 			drawRow(x, y, (BRICKS_IN_BASE - row));
 			y -= BRICK_HEIGHT;
 			x += BRICK_WIDTH / 2;
 		}
	}
	private void drawRow(double x, double y, int bricks) {
 		for (int i = 0; i < bricks; i++) {
 			drawBrick((x + i * BRICK_WIDTH), y);
		}
	}

	private void drawBrick(double x, double y) {
 		GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
 		rect.setColor(Color.BLACK);
 		add(rect);
  	}
  }