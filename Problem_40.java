import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem_40 extends GraphicsProgram {
	private static final int RADIUS = 50;
	
	public void run() {
		int xStart = 0;
		int xEnd = getWidth() - 2 * RADIUS;
		int yConst = getHeight() / 2 - RADIUS;
		
		GOval oval = new GOval(2 * RADIUS, 2 * RADIUS);
		oval.setFilled(true);
		add(oval, xStart, yConst);
		
		
		while (true) {
			while (xStart != xEnd) {
				oval.setLocation(xStart, yConst);
				pause(1);
				xStart++;
				
				if (xStart == xEnd) {
					xEnd = 0;
					while (xStart != xEnd) {
						oval.setLocation(xStart - 1, yConst);
						pause(1);
						xStart--;
					}
				}
			}
		}
	}
}
