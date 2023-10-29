import java.awt.Color;

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
		
		GOval circle = new GOval();
		
	}

}
