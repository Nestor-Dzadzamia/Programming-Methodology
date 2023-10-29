import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem_33 extends GraphicsProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		drawRandomCircle();
		
	}
	
	private void drawRandomCircle() {
		int width = getWidth();
		int height = getHeight();
		
		int radius = rgen.nextInt(1,250);
		Color color = rgen.nextColor();
		int xCoordinate = rgen.nextInt(0, width);
		int yCoordinate = rgen.nextInt(0, height);
		
		GOval circle = new GOval(radius, radius);
		circle.setFilled(true);
		circle.setFillColor(color);
		add(circle, xCoordinate, yCoordinate);
		
		
	}

}
