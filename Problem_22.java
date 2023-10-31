import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem_22 extends GraphicsProgram {
	private static final int BLOCK_SIZE = 75;
	
	public void run() {
		double width = getWidth();
		double height = getHeight();
		
		for (double i = 0; i <= 8 * BLOCK_SIZE; i += BLOCK_SIZE) {
			for (double j = 0; j <= 8 * BLOCK_SIZE; j += BLOCK_SIZE) {
				GRect rect = new GRect(width / 8, height / 8);
				rect.setFilled(true);
				rect.setFillColor(Color.cyan);
				add(rect, i, j);
			}
		}
	}
}