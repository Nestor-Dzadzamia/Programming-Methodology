import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem_34	extends GraphicsProgram {
	private	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		for (int i = 0; i < 10; i++) {
			drawRandomCircle();
		}
	}
	
	private void drawRandomCircle() {
		int width = getWidth();
		int height = getHeight();
		
		Color color = rgen.nextColor();
		int xCoordinate = rgen.nextInt(0, width);
		int yCoordinate = rgen.nextInt(0, width);
		int radius = rgen.nextInt(0,1000);
		
		GOval circle = new GOval(radius, radius);
		circle.setFilled(true);
		circle.setFillColor(color);
		add(circle, xCoordinate, yCoordinate);
	}

}
