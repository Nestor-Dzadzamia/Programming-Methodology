import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem_22 extends GraphicsProgram {
	private static final BLOCK_SIZE = 75;
	
	public void run() {
		double width = getWidth();
		double height = getHeight();
		
		for (double i = 0; i <= width; i += width / 8) {
			for (double j = 0; j <= height; j += height / 8) {
				GRect rect = new GRect(width / 8, height / 8);
				rect.setFilled(true);
				rect.setFillColor(Color.cyan);
				add(rect, i, j);
			}
		}
	}
}