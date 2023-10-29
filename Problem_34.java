import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem_34	extends GraphicsProgram {
	private	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		for (int i = 0; i < 1000; i++) {
			drawRandomCircle();
		}
	}
	
	private void drawRandomCircle() {
		int width = getWidth();
		int height = getHeight();
		
		Color color = rgen.nextColor();
		int radius = rgen.nextInt(0, 250);
		int xCoordinate = rgen.nextInt(0, width - 2 * radius);
		int yCoordinate = rgen.nextInt(0, width - 2 * radius);

		
		GOval circle = new GOval(2 * radius, 2* radius);
		circle.setFilled(true);
		circle.setFillColor(color);
		add(circle, xCoordinate , yCoordinate );
	}

}
