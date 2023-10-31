import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem_22 extends GraphicsProgram {
	private static final int BLOCK_SIZE = 45;
	
	public void run() {
		double width = getWidth();
		double height = getHeight();
		
		for (double i = 0; i < 8 * BLOCK_SIZE; i += BLOCK_SIZE) {
			for (double j = 0; j < 8 * BLOCK_SIZE; j += BLOCK_SIZE) {
				GRect rect = new GRect(BLOCK_SIZE, BLOCK_SIZE);
				rect.setFilled(true);
				if ()
				add(rect, i, j);
			}
		}
	}
}